package cn.kpy.SpringDI.CollectionDI;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @auther: cn.kpy
 * @version: 1.0
 * @Package: cn.cn.kpy.SpringDI.DependencyInjection
 * @data: 2019-3-20 8:00
 * @discription: 注入集合
 **/
public class Collections {
    private List list;
    private Set set;
    private Map map;
    private Properties properties;

    public List getList() {
        System.out.println("List Elements："+list);
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Set getSet() {
        System.out.println("Set Elements："+set);
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map getMap() {
        System.out.println("Map Elements："+map);
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Properties getProperties() {
        System.out.println("properties Elements："+properties);
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
