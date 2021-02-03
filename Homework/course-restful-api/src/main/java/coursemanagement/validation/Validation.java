package coursemanagement.validation;

import coursemanagement.dto.UserReqDto;
import coursemanagement.entity.User;
import coursemanagement.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class Validation {

    private final UserRepository userRepository;

    public Boolean isEmailExists(UserReqDto userReqDto) {
        Optional<User> user = userRepository.findByEmail(userReqDto.getEmail());
        return user.isPresent();

    }
}
