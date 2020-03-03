# easyuiStudy
版本：
    百度到，目前来看 jquery1.11.11+easyui-1.4.2对扩展插件支持的比较好，easyui自带jquery。
# 组件学习：大约三十个组件
简介：
    简单的web前台框架，封装了js和css等。
使用：
    1.导入jquery+easyui文件
        <script type="text/javascript" src="../../jquery-easyui-1.4.2/jquery.min.js"></script>
        <script type="text/javascript" src="../../jquery-easyui-1.4.2/jquery.easyui.min.js"></script>
        <link rel="stylesheet" type="text/css" href="../../jquery-easyui-1.4.2/themes/default/easyui.css">
        <link rel="stylesheet" type="text/css" href="../../jquery-easyui-1.4.2/themes/icon.css">
    2.创建easyui组件
        2种方式
            1.html标记方式
                直接只用标签创建，class指定组件类型、data-options指定配置，配置也可以写在标签上，作为标签属性。貌似标签属性优先级高于data-options指定配置。
            2.javascript方式
                创建空标签，使用js指定组件类型， 
                $('选择器').组件类型({配置});
        建议：
            和后台交互的组件用js方式
            没有和后台交互的组件（按钮等）用标签方式
    3.动态按需引入：不推荐使用，本来easyui就不大，没必要这么复杂
        其实easyui的文件不大，但是如果想更加精细，可以只引入jquery+easyloader
            <script type="text/javascript" src="../../jquery-easyui-1.4.2/jquery.min.js"></script>
            <script type="text/javascript" src="../../jquery-easyui-1.4.2/easyloader.js"></script>
        然后按需使用：会把依赖的组件都加载进页面，用调试模式看 
             加载单个模块：easyloader.load('模块', callBack);
             加载多个模块：easyloader.load(['模块1','模块2','模块3'], callBack);
             也可以直接使用标签的class创建easyui组件
对浏览器的支持
    对IE的支持不太好
组件学习：
    分类：
        布局组件（panel）
    1.Base（基础）组件
        1.parser解析器（无依赖关系）：渲染easyui组件。
        2.parser加载器（无依赖关系）：页面不需要引入全部组件，加载需要的组件。不建议使用，麻烦，加载全部组件消耗不了多少时间。
        3.progressbar进度条（无依赖关系）：
        4.resizable可调整尺寸（无依赖关系）：
        5.draggable可拖动（无依赖关系）：
05基础
    02拖动组件
    03拖动组件
    07提示信息（tooltip）组件
        为元素创建提示信息
    
        
   
注意：
    尽量不要多次解析同一个DOM元素(ID)，已经被解析过一次了，再次解析的dom是被parser重构的dom，会出现意想不到的问题。 	    
    1.布局组件：
        01.panel面板组件
        02.折叠面板 
        03.标签面板 
        04.布局面板
    
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

06数据网格和树
    01数据网格


# 项目应用
    
    1，datagrid的crud：简单的增删改查，利用了对话框。
        传到后台的参数有2个，page页码和rows页面尺寸
    2，edatagrid：扩展，用到在学
    3，datagrid-detailview：扩展，用到在学。
    
