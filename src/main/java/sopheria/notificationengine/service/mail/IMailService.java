package sopheria.notificationengine.service.mail;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public interface IMailService {
    ResponseEntity<HttpStatus> sendMail(String to, String subject, String body);
}
