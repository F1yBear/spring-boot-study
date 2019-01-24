package com.elasticsearch.bean;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * 新闻实体类
 *
 * @author wangfeixiong
 */
public class News {

    private static final String[] sourceArray = {"天涯贴吧","网易新闻","知乎日报","今日头条","腾讯新闻","百度贴吧"};
    private static final String[] titleArray = {"双十一的凌晨两点：阿里、京东、苏宁、小米、网易的战绩都在这了",
            "蔡英文“卖惨”称国民党“凭啥教训我” 被怒批：搞不清楚状况",
            "熟悉的味道！和共享单车一样的泡沫，正在美国上演",
            "强冷空气将发货 下周中东部遭雨雪降温",
            "RNG得罪多人？奔驰走人耐克解约，广告一夜全无，战队该何去何从",
            "Uzi秒选轮子妈后Mlxg爆了粗口？网友：选完锤石为何不拿滑",
            "王思聪吃热狗上热搜，全民狂欢，网友的想象力简直突破天际了！"};
    private static final Random RANDOM = new Random();

    private static final String CON = "LOL主播55开，原名卢本伟，前皇族电子竞技俱乐部英雄联盟分部中单，在随即获得S3全球决赛亚军后退役，退役后投身游戏解说和游戏直播行业，而他也因为一句“我与Faker55开吧，我也经常单杀他的”成为了国内英雄联盟中被反复热炒的一个梗，并将斗鱼直播间取名“White55开”。经过长久的运作成为了斗鱼平台毫无争议的一哥，但也留下了“表面兄弟”等一连串的负面新闻。前期直播中经常会爆粗口，后期好了很多。55开，算的上中国LOL职业电竞以及视频直播的第一批开拓者，收获了众多的粉丝还有金钱。";


    public News() {
        this.id = RANDOM.nextInt(100000);
        this.title = titleArray[RANDOM.nextInt(7)];
        this.content = CON;
        this.source =sourceArray[RANDOM.nextInt(5)];
        this.createDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(new Date());
        this.length = content.length();
    }

    private int id;

    private String title;

    private String content;

    private String source;

    private String createDate;

    private long length;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getsource() {
        return source;
    }

    public void setSource(String source) {
        source = source;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("News{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append('\'');
        sb.append(", content='").append(content).append('\'');
        sb.append(", Source='").append(source).append('\'');
        sb.append(", createDate=").append(createDate);
        sb.append(", length=").append(length);
        sb.append('}');
        return sb.toString();
    }
}
