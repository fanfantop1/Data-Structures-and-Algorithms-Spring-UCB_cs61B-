import static com.google.common.truth.Truth.assertThat;
import org.junit.Test;

public class testsort {

    @Test
    public void testSort() {  
    String[] input = {"c","b","a","d"};
    String[] expect = {"a","b","c","d"};

    Sort.Sort(input);
    assertThat(input).isEqualTo(expect);
    
    }


  
    @Test 
    public void testfindsmallest() {
        String[] input = {"b","c","d","a"};
        int expect = 3;
        int result = Sort.findsmallest(input, 0);
        assertThat(result).isEqualTo(expect);
    }



    @Test 
    public void testswap() {
        String[] input = {"a","b"};
        String[] expect = {"b","a"};
        Sort.swap(input, 0, 1);
        assertThat(input).isEqualTo(expect);
    }



}