package coursemanagement.service;

import coursemanagement.dto.UserReqDto;
import coursemanagement.dto.UserResDto;
import coursemanagement.entity.User;
import coursemanagement.error.ErrorCodes;
import coursemanagement.error.ServiceRuntimeException;
import coursemanagement.factory.UserFactory;
import coursemanagement.repository.UserRepository;
import coursemanagement.validation.Validation;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.cache.annotation.CachePut;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final UserFactory userFactory;
    private final Validation validation;

    @Transactional
    public UserResDto saveUser(UserReqDto userReqDto) throws ServiceRuntimeException {
        User user;
        if (Objects.isNull(userReqDto.getId())) {
            // check email exists
            if (validation.isEmailExists(userReqDto)) {
                throw new ServiceRuntimeException(
                        HttpStatus.IM_USED,
                        ErrorCodes.ERR002,
                        "Email already exists");
            }

            user = userFactory.createUser(userReqDto);
        } else {
            user = userRepository.findById(userReqDto.getId())
                    .orElseThrow(() -> new ServiceRuntimeException(
                            HttpStatus.NOT_FOUND,
                            ErrorCodes.ERR001,
                            String.format("User not found: #%s", userReqDto.getId())));
        }
        modelMapper.map(userReqDto, user);
        User savedUser = userRepository.save(user);
        return modelMapper.map(savedUser, UserResDto.class);

    }


}
