package management.human.resource;


public class ApiConstant {

    public static final String API_ROOT = "/api";
    public static final String API_SERVICE = "/management";
    public static final String API_V1 = "/v1";

    public static final String API_ROOT_SERVICE = API_ROOT + API_SERVICE + API_V1;

    public static final String JOB = "/jobs";
    public static final String JOB_KEY = JOB + "/{jobKey}";

    public static final String EMPLOYEE = "/employees";
    public static final String EMPLOYEE_KEY = EMPLOYEE + "/{employeeKey}";


    private ApiConstant() {
    }

}
