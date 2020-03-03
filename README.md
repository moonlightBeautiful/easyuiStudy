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
        无依赖关系的：
            1.parser解析器：渲染easyui组件。
            2.parser加载器：页面不需要引入全部组件，加载需要的组件。不建议使用，麻烦，加载全部组件消耗不了多少时间。
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
            3.Switchbutton 开关按钮
        有依赖关系的：
            4.Menubutton 菜单按钮
            5.Splitbutton 分割菜单按钮
    3.Layout（布局）组件：
        有依赖关系的：
            1.panel面板组件
                2.折叠面板 
                3.标签面板 
                4.布局面板       
    4.Window（窗口）组件
        有依赖关系的：
            1.Window 窗口
                2.Messager 消息框
                3.Dialog 对话框
    5.DataGrid（数据网格）与 Tree（树）
        有依赖关系的：
            1.Datagrid 数据网格
                3.Propertygrid 属性网格
                4.Treegrid 树形网格
            2.Tree 树
    6.Form（表单）
        无依赖关系的：
            1.Form 表单
            2.Calendar 日历
        有依赖关系的：    
            3.Validatebox 验证框
            4.textbox 文本框
                5.passwordbox 密码框
                6.filebox 文件框
                7.Numberbox 数字框
                8.Spinner 微调器
                    9.Numberspinner 数值微调器
                    10.Timespinner 时间微调器
                        11.DateTimeSpinner 日期时间微调框
            12.Combo 组合
                13.Datebox 日期框
                    14.Datetimebox 日期时间框
                15.Combobox 组合框           
                    16.tagbox 标签框
                17.Combotree 组合树
                18.Combogrid 组合网格
                19.ComboTreeGrid 树形表格下拉框
            20.checkbox（复选框）和 radiobutton（单选框） 使用
            
            
            
           





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
