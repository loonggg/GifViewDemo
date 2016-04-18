package net.loonggg.gif;

import net.loonggg.gif.view.GifView;
import android.app.Activity;
import android.os.Bundle;

public class Gif extends Activity {
	private GifView gif1, gif2;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		gif1 = (GifView) findViewById(R.id.gif1);
		// 设置背景gif图片资源
		gif1.setMovieResource(R.raw.kitty);
		gif2 = (GifView) findViewById(R.id.gif2);
		gif2.setMovieResource(R.raw.b);
		// 设置暂停
		// gif2.setPaused(true);

	}

}