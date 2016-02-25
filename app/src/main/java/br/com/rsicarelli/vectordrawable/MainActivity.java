package br.com.rsicarelli.vectordrawable;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.toolbar)
    Toolbar toolbar;

    @Bind(R.id.image_view)
    ImageView imageView;

    private boolean clicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        setUpToolbar();
    }

    @OnClick(R.id.change_image_view)
    public void click(View view) {
        imageView.setImageResource(getDrawableResId());
        clicked = !clicked;
    }

    private void setUpToolbar() {
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_close);
    }

    private int getDrawableResId() {
        return clicked ? R.drawable.ic_fingerprint : R.drawable.ic_important_devices;
    }
}
