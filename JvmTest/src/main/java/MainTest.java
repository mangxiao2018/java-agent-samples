import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

@Slf4j(topic = "c.MainTest")
public class MainTest {
    public static void main(String[] args){
        while (true){
            Scanner s = new Scanner(System.in);
            int number = s.nextInt();
            if (number == 1){
                Student student = new Student();
                student.test();
                log.debug("executed to MainTest.");
            }else if (number == 4){
                break;
            }
        }
    }
}
