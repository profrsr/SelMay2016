package keyword;

import java.lang.reflect.Method;
import wrappers.OpentapsWrappers;

public class LearnReflection {

	public static void main(String[] args) {

		Class<OpentapsWrappers> wrapper = OpentapsWrappers.class;

		Method[] meth = wrapper.getMethods();

		for (Method method : meth) {

			System.out.println(method.getName());
		}

	}

}
