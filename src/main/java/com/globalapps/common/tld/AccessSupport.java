package com.globalapps.common.tld;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;

import org.apache.commons.validator.GenericValidator;

import com.globalapps.security.Credential;

/**
 * <b>REVISION 1.0</b><br>
 * <b>Fecha:</b> 18-12-2018 <br>
 * <p>Logica para la tiqueta HasAccess</p>
 * @author ecalderon (1.0)
 * @version 1.0
 */
public class AccessSupport extends BodyTagSupport  {
	/** Automatically generated javadoc for: serialVersionUID */
	private static final long serialVersionUID = -4026757952360358376L;
	/** Los accesos que serán considerados como válidos. Pueden contener operadores (&& o ||). */
	protected String rules;
	protected Credential userCredential;
	
	/**
	 * Constructor por defecto.
	 */
	public AccessSupport() {
		super();
		this.rules = null;
	}
	
	/* (no Javadoc)
	 * @see javax.servlet.jsp.tagext.Tag#doStartTag()
	 */
	public int doStartTag() throws JspException {
		int result = SKIP_BODY;
		// verifica que los campos requeridos sean válidos.
		if (!GenericValidator.isBlankOrNull(this.rules) && null != userCredential) {
				if("ALL".equals(this.rules)){
					result = EVAL_BODY_INCLUDE;
				}
				
		}
		
		return result;
	}
}
