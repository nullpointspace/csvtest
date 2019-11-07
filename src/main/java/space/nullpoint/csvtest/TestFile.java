package space.nullpoint.csvtest;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TestFile {

    String v1;
    String v2;
    Integer v3;
    boolean v4;

    @Override
    public String toString() {
        return String.join(";", v1,v2, v3 == null ? "null" : v3.toString(),String.valueOf(v4));
    }
}
