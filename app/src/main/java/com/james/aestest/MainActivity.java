package com.james.aestest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class MainActivity extends AppCompatActivity  {
    String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try{
            String string = AESCipher.aesEncryptString("Hello Joseph", "hO!-&_M/<#$*zC@;");
            Log.e(TAG,"Encrypt : " + string);

            String result = AESCipher.aesDecryptString(string, "hO!-&_M/<#$*zC@;");
            Log.e(TAG,"Decrypt : " + result);
        }catch(Exception e){

        }

    }
}
