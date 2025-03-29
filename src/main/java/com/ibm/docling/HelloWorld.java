package com.ibm.docling;

import org.graalvm.polyglot.Context;

public class HelloWorld {
	public static void main(String[] args) {
		try (Context context = Context.create()) {
			context.eval("python", "print('Hello from GraalPy!')");
		}
	}
}