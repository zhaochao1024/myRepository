package examples;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by treebear on 2017/3/24.
 */
public class ComplexObject {
    public Properties getAdminEmails() {
        return adminEmails;
    }

    public List getSomeList() {
        return someList;
    }

    public void setSomeList(List someList) {
        this.someList = someList;
    }

    public void setAdminEmails(Properties adminEmails) {
        this.adminEmails = adminEmails;

    }

    private Properties adminEmails;

    private List someList;

    public Set getSomeSet() {
        return someSet;
    }

    public void setSomeSet(Set someSet) {
        this.someSet = someSet;
    }

    private Set someSet;

    public Map getSomeMap() {
        return someMap;
    }

    public void setSomeMap(Map someMap) {
        this.someMap = someMap;
    }

    private Map someMap;
}
