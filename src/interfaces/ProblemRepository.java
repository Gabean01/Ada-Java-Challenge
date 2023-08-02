package interfaces;

import java.util.List;

public interface ProblemRepository {
    Integer findMin();
    Integer findMax();
    double avarage();
    List<Integer> showData(); 
    void setData(); 

    String reversedString(String data);
}
