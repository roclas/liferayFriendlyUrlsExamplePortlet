package shortUrlPortlet.portlet;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.DefaultFriendlyURLMapper;
import com.liferay.portal.kernel.portlet.FriendlyURLMapper;

import shortUrlPortlet.constants.ShortUrlPortletKeys;

@Component(
	    property = {
	        "com.liferay.portlet.friendly-url-routes=META-INF/friendly-url-routes/routes.xml",
	        "javax.portlet.name=" + ShortUrlPortletKeys.ShortUrl
	    },
	    service = FriendlyURLMapper.class
	)
public class ShortURLMapper extends DefaultFriendlyURLMapper {

    @Override
    public String getMapping() { return _MAPPING; }

    private static final String _MAPPING = ShortUrlPortletKeys.ShortUrl;

}
