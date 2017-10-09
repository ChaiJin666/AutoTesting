package com.test.testcase;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.test.json.dto.MessageDto;
import com.test.json.dto.ShuZuDto;
import com.test.json.dto.TagDto;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestDemo1 {

    @Test
    public void testcase1() {
        Assert.assertTrue(true);
        System.out.println("testcase1 打印成功");
        JSONObject obj = JSON.parseObject("{\"name\":\"yanghaihan\",\"age\":15}");
        String name = obj.getString("name");
        System.out.println("name:" + name);
        System.out.println(obj.getInteger("age"));
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("name","chaijin");
        map.put("age",5);
        map.put("height",1.74);
        System.out.println(JSON.toJSON(map));
    }

    @Test
    public void testCase2(){
        MessageDto msg = new MessageDto();
        msg.setMsgBody("这是我的消息");
        msg.setSendId(1224L);
        msg.setReceiveId(333L);
        System.out.println("to json" + JSON.toJSONString(msg));
        String s = "{\"msgBody\":\"yanghaihan\",\"sendId\":15,\"ex\":\"fsdf\"}";
        MessageDto msg2 = JSON.parseObject(s,MessageDto.class);
        System.out.println("msg2 msg body : " + msg2.getMsgBody());
        System.out.println("msg2 msg send : " + msg2.getSendId());
        System.out.println("msg2 msg received : " + msg2.getReceiveId());
        List<MessageDto> msgs = new ArrayList<MessageDto>();
        msgs.add(msg);
        MessageDto msg3 = new MessageDto();
        msg3.setMsgBody("dd");
        msgs.add(msg3);
        String json = JSON.toJSONString(msgs);
        System.out.println("array json:" + json);
        List<MessageDto> msgs2 = JSON.parseArray(json,MessageDto.class);
        System.out.println("ddd:" + msgs2.get(0).getMsgBody());
    }
    @Test
    public void testCase3(){
        ShuZuDto sh=new ShuZuDto();
        sh.setCode(200);
        sh.setMessage("成功");
        TagDto tag = new TagDto();
        List<TagDto> result=new ArrayList<>();
        tag.setId(111);
        tag.setName("柴进");
        tag.setWeight(900);
        result.add(tag);
        sh.setResult(result);
        System.out.println("to json:"+JSON.toJSONString(sh));
    }
}
