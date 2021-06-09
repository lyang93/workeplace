package com.lyang.test;

import ch.qos.logback.core.net.SyslogOutputStream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author：li.yang
 * @date：2019/10/30-14:25
 * @comment：
 */
public class Test01 {
    public static void main(String[] args) {
        List<Map<String, Object>> list=new ArrayList<>();
        Map<String,Object> map1=new HashMap<String,Object>();
        map1.put("AREA_NAME","新余");
        map1.put("BILLING_CYCLE",201907);
        map1.put("NUM",25);
        Map<String,Object> map2=new HashMap<String,Object>();
        map2.put("AREA_NAME","新余");
        map2.put("BILLING_CYCLE",201908);
        map2.put("NUM",22);
        list.add(map1);
        list.add(map2);
//productCatalogList.stream().map(p -> String.valueOf(p.getProdId()))
//                                           .collect(Collectors.joining(","));
        String msg=list.stream().map(p -> p.get("AREA_NAME")+"地市"+p.get("BILLING_CYCLE")+"账期有还"+p.get("NUM")+"项待确认")
            .collect(Collectors.joining("\n"));
        System.out.println(msg);

    }

}
