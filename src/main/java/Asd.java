import com.taskadapter.redmineapi.NotFoundException;

import java.io.FileNotFoundException;

abstract public class Asd {

    private String asd;

    public String getAsd() throws FileNotFoundException {
        return asd;
    }

    public void setAsd(String asd) {
        this.asd = asd;
    }
}

class qwe extends Asd {

    @Override
    public String getAsd()  throws FileNotFoundException {
        String asd = super.getAsd();
        throw new FileNotFoundException("ASD");
//        FileNotFoundException::new;
    }
}