package sopheria.notificationengine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sopheria.notificationengine.model.MailModel;
import sopheria.notificationengine.service.mail.IMailService;

@RestController
@RequestMapping(value =  "/mail")
public class MailController {

    @Autowired
    private IMailService mailService;

    @PostMapping("/sendMail/{to}")
    public ResponseEntity<HttpStatus> sendMail(@PathVariable String to, @RequestBody MailModel mailModel) {
        return mailService.sendMail(to, mailModel.subject(), mailModel.body());
    }
}
