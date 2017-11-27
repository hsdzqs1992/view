package com.zhuye.hougong.bean;

import java.util.List;

/**
 * Created by zzzy on 2017/11/27.
 */

public class CityBean {
    /**
     * data : {"list":{"A":[{"city":"阿里地区","city_code":"103"},{"city":"安庆市","city_code":"130"},{"city":"阿坝藏族羌族自治州","city_code":"185"},{"city":"阿拉善盟","city_code":"230"},{"city":"安顺市","city_code":"263"},{"city":"安阳市","city_code":"267"},{"city":"澳门特别行政区","city_code":"2911"},{"city":"鞍山市","city_code":"320"},{"city":"安康市","city_code":"324"},{"city":"阿克苏地区","city_code":"85"},{"city":"阿勒泰地区","city_code":"96"}],"B":[{"city":"保山市","city_code":"112"},{"city":"蚌埠市","city_code":"126"},{"city":"北京市","city_code":"131"},{"city":"巴彦淖尔市","city_code":"169"},{"city":"宝鸡市","city_code":"171"},{"city":"百色市","city_code":"203"},{"city":"毕节地区","city_code":"206"},{"city":"本溪市","city_code":"227"},{"city":"包头市","city_code":"229"},{"city":"滨州市","city_code":"235"},{"city":"巴中市","city_code":"239"},{"city":"北海市","city_code":"295"},{"city":"保定市","city_code":"307"},{"city":"周口市","city_code":"308"},{"city":"白银市","city_code":"35"},{"city":"白城市","city_code":"51"},{"city":"白山市","city_code":"57"},{"city":"巴音郭楞蒙古自治州","city_code":"86"},{"city":"博尔塔拉蒙古自治州","city_code":"88"}],"C":[{"city":"楚雄彝族自治州","city_code":"105"},{"city":"重庆市","city_code":"132"},{"city":"崇左市","city_code":"144"},{"city":"沧州市","city_code":"149"},{"city":"长沙市","city_code":"158"},{"city":"滁州市","city_code":"189"},{"city":"潮州市","city_code":"201"},{"city":"承德市","city_code":"207"},{"city":"常德市","city_code":"219"},{"city":"巢湖市","city_code":"251"},{"city":"郴州市","city_code":"275"},{"city":"朝阳市","city_code":"280"},{"city":"赤峰市","city_code":"297"},{"city":"池州市","city_code":"299"},{"city":"常州市","city_code":"348"},{"city":"长治市","city_code":"356"},{"city":"长春市","city_code":"53"},{"city":"成都市","city_code":"75"},{"city":"昌吉回族自治州","city_code":"93"},{"city":"昌都地区","city_code":"99"}],"D":[{"city":"大理白族自治州","city_code":"111"},{"city":"迪庆藏族自治州","city_code":"115"},{"city":"德宏傣族景颇族自治州","city_code":"116"},{"city":"东莞市","city_code":"118"},{"city":"东沙群岛","city_code":"120"},{"city":"定西市","city_code":"136"},{"city":"大连市","city_code":"167"},{"city":"东营市","city_code":"174"},{"city":"丹东市","city_code":"282"},{"city":"大同市","city_code":"355"},{"city":"达州市","city_code":"369"},{"city":"德州市","city_code":"372"},{"city":"大兴安岭地区","city_code":"38"},{"city":"大庆市","city_code":"50"},{"city":"德阳市","city_code":"74"}],"E":[{"city":"鄂州市","city_code":"122"},{"city":"鄂尔多斯市","city_code":"283"},{"city":"恩施土家族苗族自治州","city_code":"373"}],"F":[{"city":"阜阳市","city_code":"128"},{"city":"佛山市","city_code":"138"},{"city":"抚顺市","city_code":"184"},{"city":"防城港市","city_code":"204"},{"city":"抚州市","city_code":"226"},{"city":"福州市","city_code":"300"},{"city":"阜新市","city_code":"59"}],"G":[{"city":"桂林市","city_code":"142"},{"city":"贵阳市","city_code":"146"},{"city":"广安市","city_code":"241"},{"city":"固原市","city_code":"246"},{"city":"甘南藏族自治州","city_code":"247"},{"city":"广州市","city_code":"257"},{"city":"广元市","city_code":"329"},{"city":"贵港市","city_code":"341"},{"city":"赣州市","city_code":"365"},{"city":"果洛藏族自治州","city_code":"72"},{"city":"甘孜藏族自治州","city_code":"73"}],"H":[{"city":"红河哈尼族彝族自治州","city_code":"107"},{"city":"海口市","city_code":"125"},{"city":"河南省直辖县级行政单位","city_code":"127"},{"city":"合肥市","city_code":"129"},{"city":"河池市","city_code":"143"},{"city":"邯郸市","city_code":"151"},{"city":"衡阳市","city_code":"159"},{"city":"淮安市","city_code":"162"},{"city":"杭州市","city_code":"179"},{"city":"亳州市","city_code":"188"},{"city":"河源市","city_code":"200"},{"city":"衡水市","city_code":"208"},{"city":"鹤壁市","city_code":"215"},{"city":"淮南市","city_code":"250"},{"city":"黄山市","city_code":"252"},{"city":"淮北市","city_code":"253"},{"city":"贺州市","city_code":"260"},{"city":"黄冈市","city_code":"271"},{"city":"湖州市","city_code":"294"},{"city":"海南省直辖县级行政单位","city_code":"296"},{"city":"惠州市","city_code":"301"},{"city":"黄石市","city_code":"311"},{"city":"葫芦岛市","city_code":"319"},{"city":"呼和浩特市","city_code":"321"},{"city":"湖北省直辖县级行政单位","city_code":"345"},{"city":"汉中市","city_code":"352"},{"city":"菏泽市","city_code":"353"},{"city":"怀化市","city_code":"363"},{"city":"黑河市","city_code":"39"},{"city":"鹤岗市","city_code":"43"},{"city":"哈尔滨市","city_code":"48"},{"city":"呼伦贝尔市","city_code":"61"},{"city":"海西蒙古族藏族自治州","city_code":"65"},{"city":"海北藏族自治州","city_code":"67"},{"city":"海南藏族自治州","city_code":"68"},{"city":"海东地区","city_code":"69"},{"city":"黄南藏族自治州","city_code":"70"},{"city":"和田地区","city_code":"82"},{"city":"哈密地区","city_code":"91"}],"J":[{"city":"济源市","city_code":"128"},{"city":"荆州市","city_code":"157"},{"city":"锦州市","city_code":"166"},{"city":"焦作市","city_code":"211"},{"city":"荆门市","city_code":"217"},{"city":"景德镇市","city_code":"225"},{"city":"晋中市","city_code":"238"},{"city":"绵阳市","city_code":"240"},{"city":"揭阳市","city_code":"259"},{"city":"济宁市","city_code":"286"},{"city":"济南市","city_code":"288"},{"city":"晋城市","city_code":"290"},{"city":"江门市","city_code":"302"},{"city":"吉安市","city_code":"318"},{"city":"金华市","city_code":"333"},{"city":"嘉兴市","city_code":"334"},{"city":"九江市","city_code":"349"},{"city":"金昌市","city_code":"34"},{"city":"酒泉市","city_code":"37"},{"city":"佳木斯市","city_code":"42"},{"city":"鸡西市","city_code":"46"},{"city":"吉林市","city_code":"55"}],"K":[{"city":"昆明市","city_code":"104"},{"city":"开封市","city_code":"210"},{"city":"喀什地区","city_code":"83"},{"city":"克孜勒苏柯尔克孜自治州","city_code":"84"},{"city":"克拉玛依市","city_code":"95"}],"L":[{"city":"拉萨市","city_code":"100"},{"city":"临沧市","city_code":"110"},{"city":"丽江市","city_code":"114"},{"city":"莱芜市","city_code":"124"},{"city":"六盘水市","city_code":"147"},{"city":"洛阳市","city_code":"153"},{"city":"临夏回族自治州","city_code":"182"},{"city":"辽源市","city_code":"183"},{"city":"廊坊市","city_code":"191"},{"city":"龙岩市","city_code":"193"},{"city":"来宾市","city_code":"202"},{"city":"娄底市","city_code":"221"},{"city":"临沂市","city_code":"234"},{"city":"陇南市","city_code":"256"},{"city":"丽水市","city_code":"292"},{"city":"六安市","city_code":"298"},{"city":"柳州市","city_code":"305"},{"city":"吕梁市","city_code":"327"},{"city":"泸州市","city_code":"331"},{"city":"漯河市","city_code":"344"},{"city":"连云港市","city_code":"347"},{"city":"辽阳市","city_code":"351"},{"city":"聊城市","city_code":"366"},{"city":"临汾市","city_code":"368"},{"city":"兰州市","city_code":"36"},{"city":"乐山市","city_code":"79"},{"city":"凉山彝族自治州","city_code":"80"},{"city":"林芝地区","city_code":"98"}],"M":[{"city":"茂名市","city_code":"139"},{"city":"梅州市","city_code":"141"},{"city":"马鞍山市","city_code":"358"},{"city":"牡丹江市","city_code":"49"},{"city":"眉山市","city_code":"77"}],"N":[{"city":"那曲地区","city_code":"101"},{"city":"怒江傈僳族自治州","city_code":"113"},{"city":"南平市","city_code":"133"},{"city":"南通市","city_code":"161"},{"city":"南昌市","city_code":"163"},{"city":"宁波市","city_code":"180"},{"city":"宁德市","city_code":"192"},{"city":"内江市","city_code":"248"},{"city":"南宁市","city_code":"261"},{"city":"南充市","city_code":"291"},{"city":"南阳市","city_code":"309"},{"city":"南京市","city_code":"315"}],"P":[{"city":"普洱市","city_code":"108"},{"city":"莆田市","city_code":"195"},{"city":"濮阳市","city_code":"209"},{"city":"平顶山市","city_code":"213"},{"city":"盘锦市","city_code":"228"},{"city":"平凉市","city_code":"359"},{"city":"攀枝花市","city_code":"81"}],"Q":[{"city":"泉州市","city_code":"134"},{"city":"庆阳市","city_code":"135"},{"city":"钦州市","city_code":"145"},{"city":"秦皇岛市","city_code":"148"},{"city":"清远市","city_code":"197"},{"city":"青岛市","city_code":"236"},{"city":"衢州市","city_code":"243"},{"city":"曲靖市","city_code":"249"},{"city":"黔南布依族苗族自治州","city_code":"306"},{"city":"黔东南苗族侗族自治州","city_code":"342"},{"city":"黔西南布依族苗族自治州","city_code":"343"},{"city":"齐齐哈尔市","city_code":"41"},{"city":"七台河市","city_code":"47"}],"R":[{"city":"日喀则地区","city_code":"102"},{"city":"日照市","city_code":"173"}],"S":[{"city":"西双版纳傣族自治州","city_code":"109"},{"city":"三亚市","city_code":"121"},{"city":"韶关市","city_code":"137"},{"city":"石家庄市","city_code":"150"},{"city":"商丘市","city_code":"154"},{"city":"三门峡市","city_code":"212"},{"city":"十堰市","city_code":"216"},{"city":"苏州市","city_code":"224"},{"city":"朔州市","city_code":"237"},{"city":"三明市","city_code":"254"},{"city":"漳州市","city_code":"255"},{"city":"邵阳市","city_code":"273"},{"city":"宿迁市","city_code":"277"},{"city":"商洛市","city_code":"285"},{"city":"上海市","city_code":"289"},{"city":"绍兴市","city_code":"293"},{"city":"汕头市","city_code":"303"},{"city":"遂宁市","city_code":"330"},{"city":"石嘴山市","city_code":"335"},{"city":"汕尾市","city_code":"339"},{"city":"深圳市","city_code":"340"},{"city":"上饶市","city_code":"364"},{"city":"宿州市","city_code":"370"},{"city":"随州市","city_code":"371"},{"city":"绥化市","city_code":"44"},{"city":"双鸭山市","city_code":"45"},{"city":"松原市","city_code":"52"},{"city":"四平市","city_code":"56"},{"city":"山南地区","city_code":"97"}],"T":[{"city":"通化市","city_code":"165"},{"city":"太原市","city_code":"176"},{"city":"天水市","city_code":"196"},{"city":"铜仁地区","city_code":"205"},{"city":"铜川市","city_code":"232"},{"city":"台州市","city_code":"244"},{"city":"唐山市","city_code":"265"},{"city":"泰州市","city_code":"276"},{"city":"泰安市","city_code":"325"},{"city":"天津市","city_code":"332"},{"city":"铜陵市","city_code":"337"},{"city":"铁岭市","city_code":"60"},{"city":"通辽市","city_code":"64"},{"city":"吐鲁番地区","city_code":"89"},{"city":"塔城地区","city_code":"94"}],"W":[{"city":"武威市","city_code":"118"},{"city":"乌海市","city_code":"123"},{"city":"芜湖市","city_code":"129"},{"city":"乌兰察布市","city_code":"168"},{"city":"渭南市","city_code":"170"},{"city":"威海市","city_code":"175"},{"city":"文山壮族苗族自治州","city_code":"177"},{"city":"温州市","city_code":"178"},{"city":"武汉市","city_code":"218"},{"city":"潍坊市","city_code":"287"},{"city":"梧州市","city_code":"304"},{"city":"无锡市","city_code":"317"},{"city":"吴忠市","city_code":"322"},{"city":"乌鲁木齐市","city_code":"92"}],"X":[{"city":"新乡市","city_code":"152"},{"city":"许昌市","city_code":"155"},{"city":"襄樊市","city_code":"156"},{"city":"新余市","city_code":"164"},{"city":"宣城市","city_code":"190"},{"city":"厦门市","city_code":"194"},{"city":"信阳市","city_code":"214"},{"city":"西安市","city_code":"233"},{"city":"邢台市","city_code":"266"},{"city":"湘西土家族苗族自治州","city_code":"274"},{"city":"香港特别行政区","city_code":"2912"},{"city":"孝感市","city_code":"310"},{"city":"湘潭市","city_code":"313"},{"city":"徐州市","city_code":"316"},{"city":"咸阳市","city_code":"323"},{"city":"萍乡市","city_code":"350"},{"city":"咸宁市","city_code":"362"},{"city":"忻州市","city_code":"367"},{"city":"兴安盟","city_code":"62"},{"city":"锡林郭勒盟","city_code":"63"},{"city":"西宁市","city_code":"66"},{"city":"新疆维吾尔自治区直辖县级行政单位","city_code":"87"}],"Y":[{"city":"玉溪市","city_code":"106"},{"city":"宜宾市","city_code":"186"},{"city":"阳江市","city_code":"199"},{"city":"岳阳市","city_code":"220"},{"city":"盐城市","city_code":"223"},{"city":"榆林市","city_code":"231"},{"city":"云浮市","city_code":"258"},{"city":"宜昌市","city_code":"270"},{"city":"益阳市","city_code":"272"},{"city":"宜春市","city_code":"278"},{"city":"鹰潭市","city_code":"279"},{"city":"营口市","city_code":"281"},{"city":"延安市","city_code":"284"},{"city":"永州市","city_code":"314"},{"city":"烟台市","city_code":"326"},{"city":"运城市","city_code":"328"},{"city":"嘉峪关市","city_code":"33"},{"city":"扬州市","city_code":"346"},{"city":"阳泉市","city_code":"357"},{"city":"银川市","city_code":"360"},{"city":"玉林市","city_code":"361"},{"city":"伊春市","city_code":"40"},{"city":"延边朝鲜族自治州","city_code":"54"},{"city":"沈阳市","city_code":"58"},{"city":"玉树藏族自治州","city_code":"71"},{"city":"雅安市","city_code":"76"},{"city":"伊犁哈萨克自治州","city_code":"90"}],"Z":[{"city":"张掖市","city_code":"117"},{"city":"珠海市","city_code":"140"},{"city":"镇江市","city_code":"160"},{"city":"枣庄市","city_code":"172"},{"city":"中卫市","city_code":"181"},{"city":"中山市","city_code":"187"},{"city":"湛江市","city_code":"198"},{"city":"株洲市","city_code":"222"},{"city":"资阳市","city_code":"242"},{"city":"舟山市","city_code":"245"},{"city":"遵义市","city_code":"262"},{"city":"张家口市","city_code":"264"},{"city":"郑州市","city_code":"268"},{"city":"驻马店市","city_code":"269"},{"city":"张家界市","city_code":"312"},{"city":"昭通市","city_code":"336"},{"city":"肇庆市","city_code":"338"},{"city":"淄博市","city_code":"354"},{"city":"自贡市","city_code":"78"}]},"hot":[{"city":"三亚市","city_code":"121"},{"city":"北京市","city_code":"131"},{"city":"重庆市","city_code":"132"},{"city":"庆阳市","city_code":"135"}]}
     * message :
     * code : 200
     */

    private DataBean data;
    private String message;
    private String code;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public static class DataBean {
        /**
         * list : {"A":[{"city":"阿里地区","city_code":"103"},{"city":"安庆市","city_code":"130"},{"city":"阿坝藏族羌族自治州","city_code":"185"},{"city":"阿拉善盟","city_code":"230"},{"city":"安顺市","city_code":"263"},{"city":"安阳市","city_code":"267"},{"city":"澳门特别行政区","city_code":"2911"},{"city":"鞍山市","city_code":"320"},{"city":"安康市","city_code":"324"},{"city":"阿克苏地区","city_code":"85"},{"city":"阿勒泰地区","city_code":"96"}],"B":[{"city":"保山市","city_code":"112"},{"city":"蚌埠市","city_code":"126"},{"city":"北京市","city_code":"131"},{"city":"巴彦淖尔市","city_code":"169"},{"city":"宝鸡市","city_code":"171"},{"city":"百色市","city_code":"203"},{"city":"毕节地区","city_code":"206"},{"city":"本溪市","city_code":"227"},{"city":"包头市","city_code":"229"},{"city":"滨州市","city_code":"235"},{"city":"巴中市","city_code":"239"},{"city":"北海市","city_code":"295"},{"city":"保定市","city_code":"307"},{"city":"周口市","city_code":"308"},{"city":"白银市","city_code":"35"},{"city":"白城市","city_code":"51"},{"city":"白山市","city_code":"57"},{"city":"巴音郭楞蒙古自治州","city_code":"86"},{"city":"博尔塔拉蒙古自治州","city_code":"88"}],"C":[{"city":"楚雄彝族自治州","city_code":"105"},{"city":"重庆市","city_code":"132"},{"city":"崇左市","city_code":"144"},{"city":"沧州市","city_code":"149"},{"city":"长沙市","city_code":"158"},{"city":"滁州市","city_code":"189"},{"city":"潮州市","city_code":"201"},{"city":"承德市","city_code":"207"},{"city":"常德市","city_code":"219"},{"city":"巢湖市","city_code":"251"},{"city":"郴州市","city_code":"275"},{"city":"朝阳市","city_code":"280"},{"city":"赤峰市","city_code":"297"},{"city":"池州市","city_code":"299"},{"city":"常州市","city_code":"348"},{"city":"长治市","city_code":"356"},{"city":"长春市","city_code":"53"},{"city":"成都市","city_code":"75"},{"city":"昌吉回族自治州","city_code":"93"},{"city":"昌都地区","city_code":"99"}],"D":[{"city":"大理白族自治州","city_code":"111"},{"city":"迪庆藏族自治州","city_code":"115"},{"city":"德宏傣族景颇族自治州","city_code":"116"},{"city":"东莞市","city_code":"118"},{"city":"东沙群岛","city_code":"120"},{"city":"定西市","city_code":"136"},{"city":"大连市","city_code":"167"},{"city":"东营市","city_code":"174"},{"city":"丹东市","city_code":"282"},{"city":"大同市","city_code":"355"},{"city":"达州市","city_code":"369"},{"city":"德州市","city_code":"372"},{"city":"大兴安岭地区","city_code":"38"},{"city":"大庆市","city_code":"50"},{"city":"德阳市","city_code":"74"}],"E":[{"city":"鄂州市","city_code":"122"},{"city":"鄂尔多斯市","city_code":"283"},{"city":"恩施土家族苗族自治州","city_code":"373"}],"F":[{"city":"阜阳市","city_code":"128"},{"city":"佛山市","city_code":"138"},{"city":"抚顺市","city_code":"184"},{"city":"防城港市","city_code":"204"},{"city":"抚州市","city_code":"226"},{"city":"福州市","city_code":"300"},{"city":"阜新市","city_code":"59"}],"G":[{"city":"桂林市","city_code":"142"},{"city":"贵阳市","city_code":"146"},{"city":"广安市","city_code":"241"},{"city":"固原市","city_code":"246"},{"city":"甘南藏族自治州","city_code":"247"},{"city":"广州市","city_code":"257"},{"city":"广元市","city_code":"329"},{"city":"贵港市","city_code":"341"},{"city":"赣州市","city_code":"365"},{"city":"果洛藏族自治州","city_code":"72"},{"city":"甘孜藏族自治州","city_code":"73"}],"H":[{"city":"红河哈尼族彝族自治州","city_code":"107"},{"city":"海口市","city_code":"125"},{"city":"河南省直辖县级行政单位","city_code":"127"},{"city":"合肥市","city_code":"129"},{"city":"河池市","city_code":"143"},{"city":"邯郸市","city_code":"151"},{"city":"衡阳市","city_code":"159"},{"city":"淮安市","city_code":"162"},{"city":"杭州市","city_code":"179"},{"city":"亳州市","city_code":"188"},{"city":"河源市","city_code":"200"},{"city":"衡水市","city_code":"208"},{"city":"鹤壁市","city_code":"215"},{"city":"淮南市","city_code":"250"},{"city":"黄山市","city_code":"252"},{"city":"淮北市","city_code":"253"},{"city":"贺州市","city_code":"260"},{"city":"黄冈市","city_code":"271"},{"city":"湖州市","city_code":"294"},{"city":"海南省直辖县级行政单位","city_code":"296"},{"city":"惠州市","city_code":"301"},{"city":"黄石市","city_code":"311"},{"city":"葫芦岛市","city_code":"319"},{"city":"呼和浩特市","city_code":"321"},{"city":"湖北省直辖县级行政单位","city_code":"345"},{"city":"汉中市","city_code":"352"},{"city":"菏泽市","city_code":"353"},{"city":"怀化市","city_code":"363"},{"city":"黑河市","city_code":"39"},{"city":"鹤岗市","city_code":"43"},{"city":"哈尔滨市","city_code":"48"},{"city":"呼伦贝尔市","city_code":"61"},{"city":"海西蒙古族藏族自治州","city_code":"65"},{"city":"海北藏族自治州","city_code":"67"},{"city":"海南藏族自治州","city_code":"68"},{"city":"海东地区","city_code":"69"},{"city":"黄南藏族自治州","city_code":"70"},{"city":"和田地区","city_code":"82"},{"city":"哈密地区","city_code":"91"}],"J":[{"city":"济源市","city_code":"128"},{"city":"荆州市","city_code":"157"},{"city":"锦州市","city_code":"166"},{"city":"焦作市","city_code":"211"},{"city":"荆门市","city_code":"217"},{"city":"景德镇市","city_code":"225"},{"city":"晋中市","city_code":"238"},{"city":"绵阳市","city_code":"240"},{"city":"揭阳市","city_code":"259"},{"city":"济宁市","city_code":"286"},{"city":"济南市","city_code":"288"},{"city":"晋城市","city_code":"290"},{"city":"江门市","city_code":"302"},{"city":"吉安市","city_code":"318"},{"city":"金华市","city_code":"333"},{"city":"嘉兴市","city_code":"334"},{"city":"九江市","city_code":"349"},{"city":"金昌市","city_code":"34"},{"city":"酒泉市","city_code":"37"},{"city":"佳木斯市","city_code":"42"},{"city":"鸡西市","city_code":"46"},{"city":"吉林市","city_code":"55"}],"K":[{"city":"昆明市","city_code":"104"},{"city":"开封市","city_code":"210"},{"city":"喀什地区","city_code":"83"},{"city":"克孜勒苏柯尔克孜自治州","city_code":"84"},{"city":"克拉玛依市","city_code":"95"}],"L":[{"city":"拉萨市","city_code":"100"},{"city":"临沧市","city_code":"110"},{"city":"丽江市","city_code":"114"},{"city":"莱芜市","city_code":"124"},{"city":"六盘水市","city_code":"147"},{"city":"洛阳市","city_code":"153"},{"city":"临夏回族自治州","city_code":"182"},{"city":"辽源市","city_code":"183"},{"city":"廊坊市","city_code":"191"},{"city":"龙岩市","city_code":"193"},{"city":"来宾市","city_code":"202"},{"city":"娄底市","city_code":"221"},{"city":"临沂市","city_code":"234"},{"city":"陇南市","city_code":"256"},{"city":"丽水市","city_code":"292"},{"city":"六安市","city_code":"298"},{"city":"柳州市","city_code":"305"},{"city":"吕梁市","city_code":"327"},{"city":"泸州市","city_code":"331"},{"city":"漯河市","city_code":"344"},{"city":"连云港市","city_code":"347"},{"city":"辽阳市","city_code":"351"},{"city":"聊城市","city_code":"366"},{"city":"临汾市","city_code":"368"},{"city":"兰州市","city_code":"36"},{"city":"乐山市","city_code":"79"},{"city":"凉山彝族自治州","city_code":"80"},{"city":"林芝地区","city_code":"98"}],"M":[{"city":"茂名市","city_code":"139"},{"city":"梅州市","city_code":"141"},{"city":"马鞍山市","city_code":"358"},{"city":"牡丹江市","city_code":"49"},{"city":"眉山市","city_code":"77"}],"N":[{"city":"那曲地区","city_code":"101"},{"city":"怒江傈僳族自治州","city_code":"113"},{"city":"南平市","city_code":"133"},{"city":"南通市","city_code":"161"},{"city":"南昌市","city_code":"163"},{"city":"宁波市","city_code":"180"},{"city":"宁德市","city_code":"192"},{"city":"内江市","city_code":"248"},{"city":"南宁市","city_code":"261"},{"city":"南充市","city_code":"291"},{"city":"南阳市","city_code":"309"},{"city":"南京市","city_code":"315"}],"P":[{"city":"普洱市","city_code":"108"},{"city":"莆田市","city_code":"195"},{"city":"濮阳市","city_code":"209"},{"city":"平顶山市","city_code":"213"},{"city":"盘锦市","city_code":"228"},{"city":"平凉市","city_code":"359"},{"city":"攀枝花市","city_code":"81"}],"Q":[{"city":"泉州市","city_code":"134"},{"city":"庆阳市","city_code":"135"},{"city":"钦州市","city_code":"145"},{"city":"秦皇岛市","city_code":"148"},{"city":"清远市","city_code":"197"},{"city":"青岛市","city_code":"236"},{"city":"衢州市","city_code":"243"},{"city":"曲靖市","city_code":"249"},{"city":"黔南布依族苗族自治州","city_code":"306"},{"city":"黔东南苗族侗族自治州","city_code":"342"},{"city":"黔西南布依族苗族自治州","city_code":"343"},{"city":"齐齐哈尔市","city_code":"41"},{"city":"七台河市","city_code":"47"}],"R":[{"city":"日喀则地区","city_code":"102"},{"city":"日照市","city_code":"173"}],"S":[{"city":"西双版纳傣族自治州","city_code":"109"},{"city":"三亚市","city_code":"121"},{"city":"韶关市","city_code":"137"},{"city":"石家庄市","city_code":"150"},{"city":"商丘市","city_code":"154"},{"city":"三门峡市","city_code":"212"},{"city":"十堰市","city_code":"216"},{"city":"苏州市","city_code":"224"},{"city":"朔州市","city_code":"237"},{"city":"三明市","city_code":"254"},{"city":"漳州市","city_code":"255"},{"city":"邵阳市","city_code":"273"},{"city":"宿迁市","city_code":"277"},{"city":"商洛市","city_code":"285"},{"city":"上海市","city_code":"289"},{"city":"绍兴市","city_code":"293"},{"city":"汕头市","city_code":"303"},{"city":"遂宁市","city_code":"330"},{"city":"石嘴山市","city_code":"335"},{"city":"汕尾市","city_code":"339"},{"city":"深圳市","city_code":"340"},{"city":"上饶市","city_code":"364"},{"city":"宿州市","city_code":"370"},{"city":"随州市","city_code":"371"},{"city":"绥化市","city_code":"44"},{"city":"双鸭山市","city_code":"45"},{"city":"松原市","city_code":"52"},{"city":"四平市","city_code":"56"},{"city":"山南地区","city_code":"97"}],"T":[{"city":"通化市","city_code":"165"},{"city":"太原市","city_code":"176"},{"city":"天水市","city_code":"196"},{"city":"铜仁地区","city_code":"205"},{"city":"铜川市","city_code":"232"},{"city":"台州市","city_code":"244"},{"city":"唐山市","city_code":"265"},{"city":"泰州市","city_code":"276"},{"city":"泰安市","city_code":"325"},{"city":"天津市","city_code":"332"},{"city":"铜陵市","city_code":"337"},{"city":"铁岭市","city_code":"60"},{"city":"通辽市","city_code":"64"},{"city":"吐鲁番地区","city_code":"89"},{"city":"塔城地区","city_code":"94"}],"W":[{"city":"武威市","city_code":"118"},{"city":"乌海市","city_code":"123"},{"city":"芜湖市","city_code":"129"},{"city":"乌兰察布市","city_code":"168"},{"city":"渭南市","city_code":"170"},{"city":"威海市","city_code":"175"},{"city":"文山壮族苗族自治州","city_code":"177"},{"city":"温州市","city_code":"178"},{"city":"武汉市","city_code":"218"},{"city":"潍坊市","city_code":"287"},{"city":"梧州市","city_code":"304"},{"city":"无锡市","city_code":"317"},{"city":"吴忠市","city_code":"322"},{"city":"乌鲁木齐市","city_code":"92"}],"X":[{"city":"新乡市","city_code":"152"},{"city":"许昌市","city_code":"155"},{"city":"襄樊市","city_code":"156"},{"city":"新余市","city_code":"164"},{"city":"宣城市","city_code":"190"},{"city":"厦门市","city_code":"194"},{"city":"信阳市","city_code":"214"},{"city":"西安市","city_code":"233"},{"city":"邢台市","city_code":"266"},{"city":"湘西土家族苗族自治州","city_code":"274"},{"city":"香港特别行政区","city_code":"2912"},{"city":"孝感市","city_code":"310"},{"city":"湘潭市","city_code":"313"},{"city":"徐州市","city_code":"316"},{"city":"咸阳市","city_code":"323"},{"city":"萍乡市","city_code":"350"},{"city":"咸宁市","city_code":"362"},{"city":"忻州市","city_code":"367"},{"city":"兴安盟","city_code":"62"},{"city":"锡林郭勒盟","city_code":"63"},{"city":"西宁市","city_code":"66"},{"city":"新疆维吾尔自治区直辖县级行政单位","city_code":"87"}],"Y":[{"city":"玉溪市","city_code":"106"},{"city":"宜宾市","city_code":"186"},{"city":"阳江市","city_code":"199"},{"city":"岳阳市","city_code":"220"},{"city":"盐城市","city_code":"223"},{"city":"榆林市","city_code":"231"},{"city":"云浮市","city_code":"258"},{"city":"宜昌市","city_code":"270"},{"city":"益阳市","city_code":"272"},{"city":"宜春市","city_code":"278"},{"city":"鹰潭市","city_code":"279"},{"city":"营口市","city_code":"281"},{"city":"延安市","city_code":"284"},{"city":"永州市","city_code":"314"},{"city":"烟台市","city_code":"326"},{"city":"运城市","city_code":"328"},{"city":"嘉峪关市","city_code":"33"},{"city":"扬州市","city_code":"346"},{"city":"阳泉市","city_code":"357"},{"city":"银川市","city_code":"360"},{"city":"玉林市","city_code":"361"},{"city":"伊春市","city_code":"40"},{"city":"延边朝鲜族自治州","city_code":"54"},{"city":"沈阳市","city_code":"58"},{"city":"玉树藏族自治州","city_code":"71"},{"city":"雅安市","city_code":"76"},{"city":"伊犁哈萨克自治州","city_code":"90"}],"Z":[{"city":"张掖市","city_code":"117"},{"city":"珠海市","city_code":"140"},{"city":"镇江市","city_code":"160"},{"city":"枣庄市","city_code":"172"},{"city":"中卫市","city_code":"181"},{"city":"中山市","city_code":"187"},{"city":"湛江市","city_code":"198"},{"city":"株洲市","city_code":"222"},{"city":"资阳市","city_code":"242"},{"city":"舟山市","city_code":"245"},{"city":"遵义市","city_code":"262"},{"city":"张家口市","city_code":"264"},{"city":"郑州市","city_code":"268"},{"city":"驻马店市","city_code":"269"},{"city":"张家界市","city_code":"312"},{"city":"昭通市","city_code":"336"},{"city":"肇庆市","city_code":"338"},{"city":"淄博市","city_code":"354"},{"city":"自贡市","city_code":"78"}]}
         * hot : [{"city":"三亚市","city_code":"121"},{"city":"北京市","city_code":"131"},{"city":"重庆市","city_code":"132"},{"city":"庆阳市","city_code":"135"}]
         */

        private ListBean list;
        private List<HotBean> hot;

        public ListBean getList() {
            return list;
        }

        public void setList(ListBean list) {
            this.list = list;
        }

        public List<HotBean> getHot() {
            return hot;
        }

        public void setHot(List<HotBean> hot) {
            this.hot = hot;
        }

        public static class ListBean {
            private List<ABean> A;
            private List<BBean> B;
            private List<CBean> C;
            private List<DBean> D;
            private List<EBean> E;
            private List<FBean> F;
            private List<GBean> G;
            private List<HBean> H;
            private List<JBean> J;
            private List<KBean> K;
            private List<LBean> L;
            private List<MBean> M;
            private List<NBean> N;
            private List<PBean> P;
            private List<QBean> Q;
            private List<RBean> R;
            private List<SBean> S;
            private List<TBean> T;
            private List<WBean> W;
            private List<XBean> X;
            private List<YBean> Y;
            private List<ZBean> Z;

            public List<ABean> getA() {
                return A;
            }

            public void setA(List<ABean> A) {
                this.A = A;
            }

            public List<BBean> getB() {
                return B;
            }

            public void setB(List<BBean> B) {
                this.B = B;
            }

            public List<CBean> getC() {
                return C;
            }

            public void setC(List<CBean> C) {
                this.C = C;
            }

            public List<DBean> getD() {
                return D;
            }

            public void setD(List<DBean> D) {
                this.D = D;
            }

            public List<EBean> getE() {
                return E;
            }

            public void setE(List<EBean> E) {
                this.E = E;
            }

            public List<FBean> getF() {
                return F;
            }

            public void setF(List<FBean> F) {
                this.F = F;
            }

            public List<GBean> getG() {
                return G;
            }

            public void setG(List<GBean> G) {
                this.G = G;
            }

            public List<HBean> getH() {
                return H;
            }

            public void setH(List<HBean> H) {
                this.H = H;
            }

            public List<JBean> getJ() {
                return J;
            }

            public void setJ(List<JBean> J) {
                this.J = J;
            }

            public List<KBean> getK() {
                return K;
            }

            public void setK(List<KBean> K) {
                this.K = K;
            }

            public List<LBean> getL() {
                return L;
            }

            public void setL(List<LBean> L) {
                this.L = L;
            }

            public List<MBean> getM() {
                return M;
            }

            public void setM(List<MBean> M) {
                this.M = M;
            }

            public List<NBean> getN() {
                return N;
            }

            public void setN(List<NBean> N) {
                this.N = N;
            }

            public List<PBean> getP() {
                return P;
            }

            public void setP(List<PBean> P) {
                this.P = P;
            }

            public List<QBean> getQ() {
                return Q;
            }

            public void setQ(List<QBean> Q) {
                this.Q = Q;
            }

            public List<RBean> getR() {
                return R;
            }

            public void setR(List<RBean> R) {
                this.R = R;
            }

            public List<SBean> getS() {
                return S;
            }

            public void setS(List<SBean> S) {
                this.S = S;
            }

            public List<TBean> getT() {
                return T;
            }

            public void setT(List<TBean> T) {
                this.T = T;
            }

            public List<WBean> getW() {
                return W;
            }

            public void setW(List<WBean> W) {
                this.W = W;
            }

            public List<XBean> getX() {
                return X;
            }

            public void setX(List<XBean> X) {
                this.X = X;
            }

            public List<YBean> getY() {
                return Y;
            }

            public void setY(List<YBean> Y) {
                this.Y = Y;
            }

            public List<ZBean> getZ() {
                return Z;
            }

            public void setZ(List<ZBean> Z) {
                this.Z = Z;
            }

            public static class ABean {
                /**
                 * city : 阿里地区
                 * city_code : 103
                 */

                private String city;
                private String city_code;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }
            }

            public static class BBean {
                /**
                 * city : 保山市
                 * city_code : 112
                 */

                private String city;
                private String city_code;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }
            }

            public static class CBean {
                /**
                 * city : 楚雄彝族自治州
                 * city_code : 105
                 */

                private String city;
                private String city_code;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }
            }

            public static class DBean {
                /**
                 * city : 大理白族自治州
                 * city_code : 111
                 */

                private String city;
                private String city_code;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }
            }

            public static class EBean {
                /**
                 * city : 鄂州市
                 * city_code : 122
                 */

                private String city;
                private String city_code;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }
            }

            public static class FBean {
                /**
                 * city : 阜阳市
                 * city_code : 128
                 */

                private String city;
                private String city_code;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }
            }

            public static class GBean {
                /**
                 * city : 桂林市
                 * city_code : 142
                 */

                private String city;
                private String city_code;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }
            }

            public static class HBean {
                /**
                 * city : 红河哈尼族彝族自治州
                 * city_code : 107
                 */

                private String city;
                private String city_code;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }
            }

            public static class JBean {
                /**
                 * city : 济源市
                 * city_code : 128
                 */

                private String city;
                private String city_code;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }
            }

            public static class KBean {
                /**
                 * city : 昆明市
                 * city_code : 104
                 */

                private String city;
                private String city_code;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }
            }

            public static class LBean {
                /**
                 * city : 拉萨市
                 * city_code : 100
                 */

                private String city;
                private String city_code;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }
            }

            public static class MBean {
                /**
                 * city : 茂名市
                 * city_code : 139
                 */

                private String city;
                private String city_code;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }
            }

            public static class NBean {
                /**
                 * city : 那曲地区
                 * city_code : 101
                 */

                private String city;
                private String city_code;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }
            }

            public static class PBean {
                /**
                 * city : 普洱市
                 * city_code : 108
                 */

                private String city;
                private String city_code;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }
            }

            public static class QBean {
                /**
                 * city : 泉州市
                 * city_code : 134
                 */

                private String city;
                private String city_code;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }
            }

            public static class RBean {
                /**
                 * city : 日喀则地区
                 * city_code : 102
                 */

                private String city;
                private String city_code;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }
            }

            public static class SBean {
                /**
                 * city : 西双版纳傣族自治州
                 * city_code : 109
                 */

                private String city;
                private String city_code;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }
            }

            public static class TBean {
                /**
                 * city : 通化市
                 * city_code : 165
                 */

                private String city;
                private String city_code;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }
            }

            public static class WBean {
                /**
                 * city : 武威市
                 * city_code : 118
                 */

                private String city;
                private String city_code;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }
            }

            public static class XBean {
                /**
                 * city : 新乡市
                 * city_code : 152
                 */

                private String city;
                private String city_code;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }
            }

            public static class YBean {
                /**
                 * city : 玉溪市
                 * city_code : 106
                 */

                private String city;
                private String city_code;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }
            }

            public static class ZBean {
                /**
                 * city : 张掖市
                 * city_code : 117
                 */

                private String city;
                private String city_code;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }
            }
        }

        public static class HotBean {
            /**
             * city : 三亚市
             * city_code : 121
             */

            private String city;
            private String city_code;

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getCity_code() {
                return city_code;
            }

            public void setCity_code(String city_code) {
                this.city_code = city_code;
            }
        }
    }
}
