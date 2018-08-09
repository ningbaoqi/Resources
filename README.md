### Android国际化

|安卓国际化规则|
|------|
|文件夹的命名规则 values-语言代码-r国家代码 如：values-zh-rCN、values-en-rUS |
|国际化mipmap文件夹的命名规则 mipmap-语言代码-r国家代码 如果需要加分辨率可以使用 如：mipmap-zh-rCN-mdpi|

### Drawable资源
[Drawable资源](https://github.com/ningbaoqi/Resources/blob/master/README-drawable.md)

### 原始的XML资源
+ 原始XML资源一般保存在/res/xml/路径下，Android应用对原始XML资源没有任何特殊的要求，只要他是一份格式良好的XML文档即可；为了在java程序中获取实际的XML文档，可以通过Resources的如下两个方法来实现;

|方法|说明|
|------|------|
|`XmlResourceParser getXml(int id)`|`获取XML文档，并使用一个XmlPullParser来解析该XML文档，该方法返回一个解析器对象（XmlResourceParser是XmlPullParser的子类），大部分时候，可以直接调用getXml(int id)方法来获取XML文档，并对该文档进行解析，Android默认使用内置的Pull解析器来解析XML文件`|
|`InputStream openRawResource(int id)`|`获取XML文档对应的输入流`|

+ 当处于某个元素处时，可`调用XmlPullParser的getAttributeValue()方法来获取该元素的属性值`，`也可调用XmlPullParser的nextText()方法来获取文本节点的值`；

```
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = new Button(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XmlResourceParser parser = getResources().getXml(R.xml.books);
                try {
                    StringBuilder stringBuilder = new StringBuilder("");
                    while (XmlResourceParser.END_DOCUMENT != parser.getEventType()) {
                        if (parser.getEventType() == XmlResourceParser.START_TAG) {
                            String tagName = parser.getName();
                            if (tagName.equals("book")) {
                                String bookName = parser.getAttributeValue(null, "pice");
                                stringBuilder.append("价格" + bookName);
                                String bookPrice = parser.getAttributeValue(1);
                                stringBuilder.append("出版日期" + bookPrice + "署名" + parser.nextText());
                            }
                            stringBuilder.append("\n");
                        }
                        parser.next();
                    }
                } catch (Exception e) {
                    
                }
            }
        });
    }
}
```
