package i.louis.sms_management_service.RestAuthHandler;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SimpleUrlAuthenticationFailureHandler implements
        AuthenticationFailureHandler {

    protected final Log logger = LogFactory.getLog(getClass());

    private String defaultFailureUrl;

    public SimpleUrlAuthenticationFailureHandler() {
    }

    public SimpleUrlAuthenticationFailureHandler(String defaultFailureUrl) {
//        setDefaultFailureUrl(defaultFailureUrl);
        this.defaultFailureUrl = defaultFailureUrl;
    }

    @Override
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        if (defaultFailureUrl == null) {
            logger.debug("No failure URL set, sending 401 Unauthorized error");
            httpServletResponse.sendError(HttpServletResponse.SC_UNAUTHORIZED,
                    "Authentication Failed: " + e.getMessage());
        }
        else {
        }

    }
}
