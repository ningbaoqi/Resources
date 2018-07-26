### BitmapDrawable
[BitmapDrawable](https://github.com/ningbaoqi/Resources/commit/4f5056f10ffd7f0cca2159af8f71ad43d306e703)；表示的就是一张图片；并且添加了额外效果；
### NinePatchDrawable
[NinePatchDrawable](https://github.com/ningbaoqi/Resources/commit/55a8c10d59ea5a567a3394beeb0cca1ca5017a5e)；表示的就是一张图片；
### ShapeDrawable
[ShapeDrawable](https://github.com/ningbaoqi/Resources/commit/e158c5e0666cd8ca47122596a2a29843a479e489)；ShapeDrawable是通过颜色来构造的图形，它既可以是纯色的图形，也可以是具有渐变效果的图形；
### LayerDrawable
[LayerDrawable](https://github.com/ningbaoqi/Resources/commit/55e9fca94edea51870b2f6193fc8499192a201cf)；表示一种层次化的Drawable集合，通过将不同的drawable放置在不同的层上面从而达到一种叠加后的效果；`系统将会按这些Drawable对象的数组顺序来绘制他们`，`索引最大的Drawable对象将会被绘制在最上面`；
![image](https://github.com/ningbaoqi/Resources/blob/master/gif/pic-10.jpg) 
### StateListDrawable
[StateListDrawable](https://github.com/ningbaoqi/Resources/commit/f7c1dcb1beaca0b2341a81e534e8e74ce687a17c)；表示Drawable的集合，每个Drawable都对应着View的一个状态，这样系统就会根据View的状态来选择合适的Drawable；
### LevelListDrawable
[LevelListDrawable](https://github.com/ningbaoqi/Resources/commit/e548a12176c926155cba31be9e4e7f4bd80455dd)；表示一个Drawable的集合，集合中的每个Drawable都有一个等级的概念，根据不同的等级，LevelListDrawable会切换为对应的Drawable；
### TransitionDrawable
[TransitionDrawable](https://github.com/ningbaoqi/Resources/commit/202fe5beb870887ca363206110af4a5d40de3f84)；用于实现两个drawable之间的淡入淡出效果；
### InsetDrawable
[InsetDrawable](https://github.com/ningbaoqi/Resources/commit/01c08662b28c886161de90a64ed1c1b2555d6bc0)；可以将其他Drawalebe内嵌到自己当中，并可以在四周留出一定的间距，当一个View希望自己的背景比自己的实际区域小的时候，可以采用InsetDrawable来实现；
### ScaleDrawable
[ScaleDrawable](https://github.com/ningbaoqi/Resources/commit/6cb8fbb0b4110b36a83b840d60636967d886bb0e)；可以根据自己的等级将指定的Drawable缩放到一定比例；等级0表示ScaleDrawable不可见，这是默认值，要想ScaleDrawable可见，需要等级不能为0；ScaleDrawable的级别为最大值10000，那么就没有缩放的效果，如果ScaleDrwaable的级别越大，那么内部的Drawable看起来就越大，如果ScaleDrawable的XML中所定义的缩放比例越大，那么内部的Drawable看起来就越小；
