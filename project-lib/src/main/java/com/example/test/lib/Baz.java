package com.example.test.lib;

import com.example.test.spa.Foo;
import com.example.test.spb.FooImpl;

public class Baz {
    private Foo mFoo = null;

    public void methodBaz() {
        mFoo = new FooImpl();
        mFoo.methodFoo();
    }
}
