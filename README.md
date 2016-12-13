# MyMVPdemo
我的MVP，最垃圾！
      Presenter 处理业务逻辑（登陆，清除），里面传入接口属性
      View 处理UI控件的某些方法，Activity通过实现该View来执行和UI有关的操作
      IUserBiz、UserBiz 用户业务接口、该接口的实现
      LoginListener 登录的事件监听（通过接口回掉实现）
