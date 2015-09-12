package com.example.rincliu.textureview;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private Camera camera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextureView tv = (TextureView) findViewById(R.id.tv);
        tv.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {

            //A SurfaceTexture is available only after the TextureView is attached to a window!
            @Override
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i1) {
                if (camera == null) {
                    camera = Camera.open();
                }
                try {
                    camera.setPreviewTexture(surfaceTexture);
                } catch (IOException e)
                {}
                camera.startPreview();
            }

            //Invoked when the SurfaceTexture's buffers size changed.
            @Override
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i1) {
                //Ignored, Camera does all the work for us。
            }

            @Override
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                camera.stopPreview();
                camera.release();
                return true;
            }

            @Override
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                //Invoked every time there's a new Camera preview frame.
            }
        });


    }

}
