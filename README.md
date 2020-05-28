# easyuiStudy
版本：
    百度到，目前来看 jquery1.11.11+easyui-1.4.2对扩展插件支持的比较好，easyui自带jquery。
# 组件学习：大约三十个组件
简介：
    简单的web前台框架，封装了js和css等。
使用：
    1.导入jquery+easyui文件
        2个css（主题和图标）、3个easyui的js（1个jquery、1个中文支持、一个easyui核心包）
        <link rel="stylesheet" type="text/css" href="../../jquery-easyui-1.4.2/themes/default/easyui.css">
        <link rel="stylesheet" type="text/css" href="../../jquery-easyui-1.4.2/themes/icon.css">
        <script type="text/javascript" src=" ../../jquery-easyui-1.9.4/jquery.min.js"></script>
        <script type="text/javascript" src="../../jquery-easyui-1.9.4/locale/easyui-lang-zh_CN.js"></script>
        <script type="text/javascript" src="../../jquery-easyui-1.4.2/jquery.easyui.min.js"></script>     
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
    4.改变组件的选项值后生效问题
        直接 .组件（{选项}）形式渲染。
    5.更改主题        
    6.对浏览器的支持
        对IE的支持不太好
组件学习：
    分类：
        布局组件（panel）
    1.Base（基础）组件
        无依赖关系的：
            1.parser解析器：渲染easyui组件。
            2.easyLoader加载器：页面不需要引入全部组件，加载需要的组件。不建议使用，麻烦，加载全部组件消耗不了多少时间。
            3.progressbar进度条：
            4.resizable可调整尺寸：
            5.draggable可拖动：
            6.droppable可放置：
            7.tooltip提示框：
        有依赖关系的：
            8. Searchbox 搜索框，依赖 Menubutton 菜单按钮
            9. Pagination 分页，依赖 Linkbutton 链接按钮
    2.Menu（菜单）与 Button（按钮）组件
        无依赖关系的：
            1.Linkbutton 链接按钮
            2.Menu 菜单
        有依赖关系的：
            3.Menubutton 菜单按钮，依赖 Menu 菜单 和 Linkbutton 链接按钮
            4.Splitbutton 分割菜单按钮，依赖 Menubutton 菜单按钮
            5.Sidemenu 侧栏菜单 依赖 accordion 和 tree 和 tooltip
    3.Layout（布局）组件：
        无依赖关系的：
            1.Panel 面板
        有依赖关系的：
            2.Accordion 折叠面板，依赖 Panel 面板               
            3.Tabs 标签页/选项卡，依赖 Panel 面板 和 Linkbutton 链接按钮  
            4.Layout 布局，依赖 Panel 面板 和 Resizable可调整尺寸  
    4.Window（窗口）组件
        有依赖关系的：
            1.Window 窗口，依赖 Panel 面板 和 draggable 和 resizable
            2.Dialog 对话框，依赖 window 和 linkbutton
            3.Messager 消息框，依赖 window 和 linkbutton 和 progressbar
    5.DataGrid（数据网格）与 Tree（树）
        有依赖关系的：
            1.Datagrid 数据网格 依赖 panel resizable linkbutton pagination
                3.Propertygrid 属性网格 依赖 datagrid
                4.Treegrid 树形网格 依赖 datagrid
            2.Tree 树 依赖 draggable droppable
    6.Form（表单）
        无依赖关系的：
            1.Calendar 日历
            22.Form 表单
        有依赖关系的：    
            2.Validatebox 验证框  依赖tooltip
            3.Textbox 文本框  依赖validatebox 和linkbutton
                4.passwordbox 密码框  依赖textbox
                5.filebox 文件框   依赖textbox 
            6.Numberbox 数字框 依赖 Validatebox
            7.Spinner 微调器 依赖 Validatebox
                    8.Numberspinner 数值微调器   依赖 Spinner 和 Numberbox
                    9.Timespinner 时间微调器
                        10.DateTimeSpinner 日期时间微调框   依赖 timespinner
            11.Combo 组合 依赖 validatebox 和 panel                    
                12.Datebox 日期框 依赖 combo 和 calendar
                    13.Datetimebox 日期时间框  依赖 datebox 和 timespinner
                14.Combobox 组合框  依赖 Combo                
                    15.tagbox 标签框  依赖 combobox 
                16.Combotree 组合树 依赖 combo 和 tree
                17.Combogrid 组合网格 依赖 combo 和 datagrid
                18.ComboTreeGrid 组合树网格  依赖 combo 和 treegrid 
            19.checkbox 复选框
            20.radiobutton 单选框 
            21.slide滑块 依赖draggable
应用场景
    左侧菜单栏：卡片布局+树形菜单
    右侧数据栏：连接按钮+菜单按钮+搜索框+数据网格+菜单
    头部模块栏：连接按钮
    顶部信息栏：logo+菜单按钮        
            
            
           





Slider 滑块








Base（基础）组件
        无依赖关系的：
            1.parser解析器：渲染easyui组件。
            2.parser加载器：页面不需要引入全部组件，加载需要的组件。不建议使用，麻烦，加载全部组件消耗不了多少时间。
            3.progressbar进度条：
            4.resizable可调整尺寸：
            5.draggable可拖动：
            6.Droppable可放置：
            7.Tooltip提示框：
            
Menu（菜单）与 Button（按钮）组件
        无依赖关系的：
            1.Linkbutton 链接按钮
            2.Menu 菜单
            3.Switchbutton 开关按钮
        有依赖关系的：
            4.Menubutton 菜单按钮
            5.Splitbutton 分割菜单按钮
