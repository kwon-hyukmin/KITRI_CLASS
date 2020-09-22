package lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycle implements InitializingBean, DisposableBean{

	@Override
	public void destroy() throws Exception {
		System.out.println("后 家戈 角青");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("后 檬扁拳 角青");
	}

}
