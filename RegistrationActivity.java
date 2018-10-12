package com.example.admin.streetylogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegistrationActivity extends AppCompatActivity
{
    EditText etName,etEmail,etPwd,etConfirmPwd;
    Button btnSignUp;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        mappingWidgets();
        addListeners();
    }

    private void mappingWidgets()
    {
        etName=findViewById(R.id.etName);
        etEmail=findViewById(R.id.etEmail);
        etPwd=findViewById(R.id.etPassword);
        etConfirmPwd=findViewById(R.id.etConfirmPassword);
        btnSignUp=findViewById(R.id.btnSignUp);
    }

    private void addListeners()
    {
    }

}
