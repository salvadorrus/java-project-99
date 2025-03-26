package hexlet.code.component;

import hexlet.code.dto.label.LabelCreateDTO;
import hexlet.code.dto.taskStatus.TaskStatusCreateDTO;
import hexlet.code.dto.user.UserCreateDTO;
import hexlet.code.service.LabelService;
import hexlet.code.service.TaskStatusService;
import hexlet.code.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DataInitializer implements ApplicationRunner {

    @Autowired
    private final UserService userService;

    @Autowired
    private final TaskStatusService taskStatusService;

    @Autowired
    private final LabelService labelService;

    @Override
    public void run(ApplicationArguments args) {
        var userData = new UserCreateDTO();
        userData.setEmail("hexlet@example.com");
        userData.setPassword("qwerty");
        userService.create(userData);

        var taskStatus = new TaskStatusCreateDTO();
        taskStatus.setName("Draft");
        taskStatus.setSlug("draft");
        taskStatusService.create(taskStatus);

        taskStatus.setName("ToReview");
        taskStatus.setSlug("to_review");
        taskStatusService.create(taskStatus);

        taskStatus.setName("ToBeFixed");
        taskStatus.setSlug("to_be_fixed");
        taskStatusService.create(taskStatus);

        taskStatus.setName("ToPublish");
        taskStatus.setSlug("to_publish");
        taskStatusService.create(taskStatus);

        taskStatus.setName("Published");
        taskStatus.setSlug("published");
        taskStatusService.create(taskStatus);

        var label = new LabelCreateDTO();
        label.setName("feature");
        labelService.create(label);

        label.setName("bug");
        labelService.create(label);
    }
}
