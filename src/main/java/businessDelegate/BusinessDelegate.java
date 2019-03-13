package businessDelegate;

import lombok.Data;

/**
 * Created by zhengwenzhan on 2019-03-13
 */
@Data
public class BusinessDelegate {

    private BusinessLookup businessLookup;
    private BusinessService businessService;
    private ServiceType serviceType;

    public void doTask() {
        businessService = businessLookup.getService(serviceType);
        businessService.service();
    }
}
