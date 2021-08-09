import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "c.Student")
public class Student {

    public String test(){
        log.debug("### test ###");
        return "I`m testor of javaagent.";
    }
}
