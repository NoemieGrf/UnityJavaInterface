package com.grf.aar;

public class JavaInterface
{
    public static String staticString = "This is a static string";

    private static ICSharpInterface _csharpInterface = null;

    public static String GetStaticString()
    {
        return staticString;
    }

    public static void SetCSharpInterface(ICSharpInterface csharpCaller)
    {
        _csharpInterface = csharpCaller;
    }

    public static void JavaCallCSharpVoidCall()
    {
        if (_csharpInterface != null)
            _csharpInterface.VoidParaCall();
    }

    public static void JavaCallCSharpNumericCall(int a)
    {
        if (_csharpInterface != null)
            _csharpInterface.NumericCall(a + 10);
    }
}
