# easyuiStudy
版本：
    百度到，目前来看 jquery1.11.11+easyui-1.4.2对扩展插件支持的比较好，easyui自带jquery。
# 组件学习：大约三十个组件
简介：
    简单的easyui前台框架
使用：
    1.导入jquery+easyui文件
        <script type="text/javascript" src="../../jquery-easyui-1.4.2/jquery.min.js"></script>
        <script type="text/javascript" src="../../jquery-easyui-1.4.2/jquery.easyui.min.js"></script>
        <link rel="stylesheet" type="text/css" href="../../jquery-easyui-1.4.2/themes/default/easyui.css">
        <link rel="stylesheet" type="text/css" href="../../jquery-easyui-1.4.2/themes/icon.css">
    2.创建easyui组件，
        2种方式
            1.直接只用标签创建，class指定组件类型、
                原理：$.parser在起作用。
            2.创建空标签，使用js指定组件类型， $('选择器').组件类型();
        建议：
            和后台交互的组件用js方式，没有和后台交互的组件（按钮等）用标签方式
    3.属性的使用
        2种方式
            1.属性可以写在标签节点上也可以写在标签节点的data-options属性上
            2.属性可以js方式指定
        建议：
            不是很复杂的、少的，用标签的方式，复杂的、多的用js方式。
    4.动态按需引入：不推荐使用，本来easyui就不大，没必要这么复杂
        其实easyui的文件不大，但是如果想更加精细，可以只引入jquery+easyloader
            <script type="text/javascript" src="../../jquery-easyui-1.4.2/jquery.min.js"></script>
            <script type="text/javascript" src="../../jquery-easyui-1.4.2/easyloader.js"></script>
        然后按需使用：会把依赖的组件都加载进页面，用调试模式看 
             加载单个模块：easyloader.load('模块', callBack);
             加载多个模块：easyloader.load(['模块1','模块2','模块3'], callBack);
             也可以直接使用标签的class创建easyui组件
组件学习：
    分类：
        布局组件（panel）
    布局组件：
        01panel：面板组件
            很多组件依赖于面板组件，必须熟悉面板组件
    
  
  
    
    01布局组件
    01。面板组件
    02.标签页组件
    03.折叠面板
04窗口组件
    01。消息框组件（Messager） 
        包括警示（alert）、确认（confirm）、提示（prompt）、进展（progress）等等。
    02。对话框组件（dialog）
        和窗口组件有啥区别 具体不懂
    03。窗口组件（Window） 
        窗口（window）是一个浮动的、可拖拽的面板，可以当做应用程序窗口使用。
03菜单和按钮
    01。菜单
    02。连接按钮
    03。菜单按钮
    04。分割按钮
05基础
    01进度条组件
    02拖动组件
    03拖动组件
    07提示信息（tooltip）组件
        为元素创建提示信息
    09基本加载器（EasyLoader）组件
        不用把整个easyui引入，只需要引入jquery和easyloader.js就可以，
        调用easyloader.load('所需模块', function () { // 加载指定的模块 });即可。
06数据网格和树
    01数据网格


# 项目应用
    
    1，datagrid的crud：简单的增删改查，利用了对话框。
        传到后台的参数有2个，page页码和rows页面尺寸
    2，edatagrid：扩展，用到在学
    3，datagrid-detailview：扩展，用到在学。
    
