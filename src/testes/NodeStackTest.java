package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Assertions;

import source.NodeStack;
import source.EmptyStackException;
import source.FullStackException;
import source.Stack;

import org.junit.Test;

public class NodeStackTest {
    
	static final Stack<Integer> a = new NodeStack<Integer>();
    	
    @Test
    public void test() {
        
    	a.push(7);
		assertEquals("[7]", a.toString(), "Deve imprimir [7]");
		a.push(9);
		assertEquals("[9, 7]", a.toString(), "Deve imprimir [9, 7]");
		a.push(1);
		assertEquals("[1, 9, 7]", a.toString(), "Deve imprimir [1, 9, 7]");
		
		assertEquals(1, a.pop(), "Deve ter desempilhado 1");
		assertEquals("[9, 7]", a.toString(), "Deve imprimir [9, 7]");
		assertEquals(9, a.pop(), "Deve ter desempilhado 9");
		assertEquals("[7]", a.toString(), "Deve imprimir [7]");
		assertEquals(7, a.pop(), "Deve ter desempilhado 7");
		assertEquals("[]", a.toString(), "Deve imprimir []");

		assertTrue(a.isEmpty());

		assertThrows(EmptyStackException.class, () -> { a.pop(); });
    	
    }
    
}

