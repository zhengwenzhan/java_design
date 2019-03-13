package businessDelegate;

import lombok.Data;

/**
 * Created by zhengwenzhan on 2019-03-13
 */
@Data
public class BusinessLookup {

    private EjbService ejbService;

    private JmsService jmsService;


    public BusinessService getService(ServiceType serviceType) {
        if (ServiceType.EJB.equals(serviceType)) {
            return ejbService;
        } else {
            return jmsService;
        }
    }
}
