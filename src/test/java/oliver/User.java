package oliver;

import oliver.validate.*;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @auhor Oliver
 * @date 2019/5/24 16:00
 */
@RequestValid()
public class User {

    @RequestValid(value="my_name",nullable=true)
    private String name;

   // @Valid(nullable=true)
    private Integer age;

    @RequestValid(value = "user_id")
    private String userId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public static void main(String[] args) throws IllegalAccessException {
        System.out.println(ValidUtils.getAllFieldList(User.class));

        User user = new User();

        //如果传入的是一个map,将map转为对象
        Map<String,Object> map  = new HashMap<>();
        map.put("user_id","aaaa");
        map.put("my_name","ddddd");
        try {
            ValidateManager.valid(user,map);
        } catch (ValidException e) {

            System.out.println(e.getMessage());
        }
//
//        //如果传入的是一个map,将map转为对象
//        Map<String,Object> map  = new HashMap<>();
//        map.put("user_id","aaaa");
//        Field[] declaredFields = User.class.getDeclaredFields();
//
//        for (Field declaredField : declaredFields) {
//
//            if(declaredField.isAnnotationPresent(RequestParam.class)){
//                declaredField.setAccessible(true);
//                declaredField.set(user,"aaaa");
//            }
//
//        }

        System.out.println(user.getUserId()+"======="+user.getName());



    }
}