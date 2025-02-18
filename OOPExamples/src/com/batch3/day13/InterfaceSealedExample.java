package com.batch3.day13;

public sealed interface InterfaceSealedExample permits AnotherInterfaceSealed,SealedClassExample4{
	void abstractSealed();
}
