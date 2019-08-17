package com.jianzixing.webapp.service.wechat;

public enum WeChatCode {
    C_1(-1, "系统繁忙，此时请开发者稍候再试"),
    C0(0, "请求成功"),
    C40001(40001, "获取 access_token 时 AppSecret 错误，或者 access_token 无效。请开发者认真比对 AppSecret 的正确性，或查看是否正在为恰当的公众号调用接口"),
    C40002(40002, "不合法的凭证类型"),
    C40003(40003, "不合法的 OpenID ，请开发者确认 OpenID （该用户）是否已关注公众号，或是否是其他公众号的 OpenID"),
    C40004(40004, "不合法的媒体文件类型"),
    C40005(40005, "不合法的文件类型"),
    C40006(40006, "不合法的文件大小"),
    C40007(40007, "不合法的媒体文件 id"),
    C40008(40008, "不合法的消息类型"),
    C40009(40009, "不合法的图片文件大小"),
    C40010(40010, "不合法的语音文件大小"),
    C40011(40011, "不合法的视频文件大小"),
    C40012(40012, "不合法的缩略图文件大小"),
    C40013(40013, "不合法的 AppID ，请开发者检查 AppID 的正确性，避免异常字符，注意大小写"),
    C40014(40014, "不合法的 access_token ，请开发者认真比对 access_token 的有效性（如是否过期），或查看是否正在为恰当的公众号调用接口"),
    C40015(40015, "不合法的菜单类型"),
    C40016(40016, "不合法的按钮个数"),
    C40017(40017, "不合法的按钮个数"),
    C40018(40018, "不合法的按钮名字长度"),
    C40019(40019, "不合法的按钮 KEY 长度"),
    C40020(40020, "不合法的按钮 URL 长度"),
    C40021(40021, "不合法的菜单版本号"),
    C40022(40022, "不合法的子菜单级数"),
    C40023(40023, "不合法的子菜单按钮个数"),
    C40024(40024, "不合法的子菜单按钮类型"),
    C40025(40025, "不合法的子菜单按钮名字长度"),
    C40026(40026, "不合法的子菜单按钮 KEY 长度"),
    C40027(40027, "不合法的子菜单按钮 URL 长度"),
    C40028(40028, "不合法的自定义菜单使用用户"),
    C40029(40029, "不合法的 oauth_code"),
    C40030(40030, "不合法的 refresh_token"),
    C40031(40031, "不合法的 openid 列表"),
    C40032(40032, "不合法的 openid 列表长度"),
    C40033(40033, "不合法的请求字符，不能包含 \\uxxxx 格式的字符"),
    C40035(40035, "不合法的参数"),
    C40038(40038, "不合法的请求格式"),
    C40039(40039, "不合法的 URL 长度"),
    C40050(40050, "不合法的分组 id"),
    C40051(40051, "分组名字不合法"),
    C40060(40060, "删除单篇图文时，指定的 article_idx 不合法"),
    C40117(40117, "分组名字不合法"),
    C40118(40118, "media_id 大小不合法"),
    C40119(40119, "button 类型错误"),
    C40120(40120, "button 类型错误"),
    C40121(40121, "不合法的 media_id 类型"),
    C40132(40132, "微信号不合法"),
    C40137(40137, "不支持的图片格式"),
    C40155(40155, "请勿添加其他公众号的主页链接"),
    C41001(41001, "缺少 access_token 参数"),
    C41002(41002, "缺少 appid 参数"),
    C41003(41003, "缺少 refresh_token 参数"),
    C41004(41004, "缺少 secret 参数"),
    C41005(41005, "缺少多媒体文件数据"),
    C41006(41006, "缺少 media_id 参数"),
    C41007(41007, "缺少子菜单数据"),
    C41008(41008, "缺少 oauth code"),
    C41009(41009, "缺少 openid"),
    C42001(42001, "access_token 超时，请检查 access_token 的有效期，请参考基础支持 - 获取 access_token 中，对 access_token 的详细机制说明"),
    C42002(42002, "refresh_token 超时"),
    C42003(42003, "oauth_code 超时"),
    C42007(42007, "用户修改微信密码， accesstoken 和 refreshtoken 失效，需要重新授权"),
    C43001(43001, "需要 GET 请求"),
    C43002(43002, "需要 POST 请求"),
    C43003(43003, "需要 HTTPS 请求"),
    C43004(43004, "需要接收者关注"),
    C43005(43005, "需要好友关系"),
    C43019(43019, "需要将接收者从黑名单中移除"),
    C44001(44001, "多媒体文件为空"),
    C44002(44002, "POST 的数据包为空"),
    C44003(44003, "图文消息内容为空"),
    C44004(44004, "文本消息内容为空"),
    C45001(45001, "多媒体文件大小超过限制"),
    C45002(45002, "消息内容超过限制"),
    C45003(45003, "标题字段超过限制"),
    C45004(45004, "描述字段超过限制"),
    C45005(45005, "链接字段超过限制"),
    C45006(45006, "图片链接字段超过限制"),
    C45007(45007, "语音播放时间超过限制"),
    C45008(45008, "图文消息超过限制"),
    C45009(45009, "接口调用超过限制"),
    C45010(45010, "创建菜单个数超过限制"),
    C45011(45011, "API 调用太频繁，请稍候再试"),
    C45015(45015, "回复时间超过限制"),
    C45016(45016, "系统分组，不允许修改"),
    C45017(45017, "分组名字过长"),
    C45018(45018, "分组数量超过上限"),
    C45047(45047, "客服接口下行条数超过上限"),
    C46001(46001, "不存在媒体数据"),
    C46002(46002, "不存在的菜单版本"),
    C46003(46003, "不存在的菜单数据"),
    C46004(46004, "不存在的用户"),
    C47001(47001, "解析 JSON/XML 内容错误"),
    C48001(48001, "api 功能未授权，请确认公众号已获得该接口，可以在公众平台官网 - 开发者中心页中查看接口权限"),
    C48002(48002, "粉丝拒收消息（粉丝在公众号选项中，关闭了 “ 接收消息 ” ）"),
    C48004(48004, "api 接口被封禁，请登录 mp.weixin.qq.com 查看详情"),
    C48005(48005, "api 禁止删除被自动回复和自定义菜单引用的素材"),
    C48006(48006, "api 禁止清零调用次数，因为清零次数达到上限"),
    C48008(48008, "没有该类型消息的发送权限"),
    C50001(50001, "用户未授权该 api"),
    C50002(50002, "用户受限，可能是违规后接口被封禁"),
    C50005(50005, "用户未关注公众号"),
    C61451(61451, "参数错误 (invalid parameter)"),
    C61452(61452, "无效客服账号 (invalid kf_account)"),
    C61453(61453, "客服帐号已存在 (kf_account exsited)"),
    C61454(61454, "客服帐号名长度超过限制 ( 仅允许 10 个英文字符，不包括 @ 及 @ 后的公众号的微信号 )(invalid kf_acount length)"),
    C61455(61455, "客服帐号名包含非法字符 ( 仅允许英文 + 数字 )(illegal character in kf_account)"),
    C61456(61456, "客服帐号个数超过限制 (10 个客服账号 )(kf_account count exceeded)"),
    C61457(61457, "无效头像文件类型 (invalid file type)"),
    C61450(61450, "系统错误 (system error)"),
    C61500(61500, "日期格式错误"),
    C65301(65301, "不存在此 menuid 对应的个性化菜单"),
    C65302(65302, "没有相应的用户"),
    C65303(65303, "没有默认菜单，不能创建个性化菜单"),
    C65304(65304, "MatchRule 信息为空"),
    C65305(65305, "个性化菜单数量受限"),
    C65306(65306, "不支持个性化菜单的帐号"),
    C65307(65307, "个性化菜单信息为空"),
    C65308(65308, "包含没有响应类型的 button"),
    C65309(65309, "个性化菜单开关处于关闭状态"),
    C65310(65310, "填写了省份或城市信息，国家信息不能为空"),
    C65311(65311, "填写了城市信息，省份信息不能为空"),
    C65312(65312, "不合法的国家信息"),
    C65313(65313, "不合法的省份信息"),
    C65314(65314, "不合法的城市信息"),
    C65316(65316, "该公众号的菜单设置了过多的域名外跳（最多跳转到 3 个域名的链接）"),
    C65317(65317, "不合法的 URL"),
    C9001001(9001001, "POST 数据参数不合法"),
    C9001002(9001002, "远端服务不可用"),
    C9001003(9001003, "Ticket 不合法"),
    C9001004(9001004, "获取摇周边用户信息失败"),
    C9001005(9001005, "获取商户信息失败"),
    C9001006(9001006, "获取 OpenID 失败"),
    C9001007(9001007, "上传文件缺失"),
    C9001008(9001008, "上传素材的文件类型不合法"),
    C9001009(9001009, "上传素材的文件尺寸不合法"),
    C9001010(9001010, "上传失败"),
    C9001020(9001020, "帐号不合法"),
    C9001021(9001021, "已有设备激活率低于 50% ，不能新增设备"),
    C9001022(9001022, "设备申请数不合法，必须为大于 0 的数字"),
    C9001023(9001023, "已存在审核中的设备 ID 申请"),
    C9001024(9001024, "一次查询设备 ID 数量不能超过 50"),
    C9001025(9001025, "设备 ID 不合法"),
    C9001026(9001026, "页面 ID 不合法"),
    C9001027(9001027, "页面参数不合法"),
    C9001028(9001028, "一次删除页面 ID 数量不能超过 10"),
    C9001029(9001029, "页面已应用在设备中，请先解除应用关系再删除"),
    C9001030(9001030, "一次查询页面 ID 数量不能超过 50"),
    C9001031(9001031, "时间区间不合法"),
    C9001032(9001032, "保存设备与页面的绑定关系参数错误"),
    C9001033(9001033, "门店 ID 不合法"),
    C9001034(9001034, "设备备注信息过长"),
    C9001035(9001035, "设备申请参数不合法"),
    C9001036(9001036, "查询起始值 begin 不合法");

    private int code;
    private String detail;

    WeChatCode(int code, String detail) {
        this.code = code;
        this.detail = detail;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public static WeChatCode getByCode(int code) {
        String c = "C" + code;
        c = c.replace("-", "_");
        return WeChatCode.valueOf(c);
    }
}
