easyui简单介绍
    基于jquery的富客户端框架
    使用
        必须引入easyui的4个文件
        1.themes/default/easyui.css  默认的css样式
        2.themes/icon.css 一些图标
        3.jquery.min.js easyui是基于jquery的
        4.jquery.easyui.min.js  
分类：
    布局组件：
        面板组件
    窗体组件：
        消息框组件
1.面板组件：
    简介：面板组件是其他组件或元素的容器，div class=easyui-panel。
    基本面板组件的使用、面板工具、面板异步加载内容、嵌套面板
2.消息框组件：
    简介：窗体组件的一种，$.messager.消息框类型。
    警示（alert）、确认（confirm）、提示（prompt）、进度（progress）
    进阶：消息框弹出位置设置
    note：加入jquery中文脚本，否则按钮等jquery自带的文字是英文的
3.表单相关的组件：
    1.日期框组件
        简介：把可编辑的文本框和下拉日历面板结合起来，用户可以从下拉日历面板中选择日期。在文本框中输入的字符串可悲转换为有效日期。被选择的日期也可以被转换为期望的格式。
    2.日期时间框组件 
        简介：下拉日历面板附带一个时间微调器的日期框组件。 
    3.时间微调器：
        简介：时间微调器（timespinner）是基于微调器（spinner）创建的。它与数值微调器（numberspinner）相似，但是它只显示时间值。时间微调器（timespinner）允许用户通过点击组件右侧的小微调按钮来增加或减少时间。
        NOTE：IE9以下版本不支持
    