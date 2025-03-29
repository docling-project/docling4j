package com.ibm.docling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;

public class GraalPyTest {

    @Test
    public void testMain() {
        try (Context context = Context.newBuilder().allowAllAccess(true).build()) {
			Value result = context.eval("python", "'Hello from GraalPy!'");
            assertEquals("Hello from GraalPy!", result.asString());
		}
    }
}
