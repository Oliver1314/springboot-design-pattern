# springboot-design-pattern
springboot  开发 设计模式demo

1.策略模式:
        要点:要在构造方法中注入接口的所有实现类,并放入Map中保存，其中key就是各种策略的标识条件
        如果注入的是List,那么List中存的就是实体类集合，但是不能同时有两个构造方法的注入。
        但是可以同时作为同一个构造方法的入参