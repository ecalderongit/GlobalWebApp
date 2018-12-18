package com.globalapps.common.tld;

import javax.servlet.jsp.JspException;

import org.apache.taglibs.standard.lang.support.ExpressionEvaluatorManager;

import com.globalapps.security.Credential;

/**
 * <b>REVISION 1.0</b><br>
 * <b>Fecha:</b> 18-12-2018<br>
 * <p>Logica para la tiqueta HasAccess</p>
 * @author ecalderon (1.0)
 * @version 1.0
 */
public class HasAccessTag extends AccessSupport {
	/** Automatically generated javadoc for: serialVersionUID */
	private static final long serialVersionUID = 7292958230328510657L;
	private static final String RULES = "rules"; //$NON-NLS-1$
	private static final String USER_CREDENTIAL = "credential"; //$NON-NLS-1$
	protected String rules_;
	protected String credential_;
	
	/**
	 * Constructor por defecto. 
	 */
	public HasAccessTag() {
		init();
	}
	
	/**
	 * Inicializa los valores de los atributos. 
	 */
	protected void init() {
		this.rules_ = null;
	}
	
	public void release() {
		super.release();
		this.init();
	}
	
	/* (no Javadoc)
	 * @see javax.servlet.jsp.tagext.Tag#doStartTag()
	 */
	public int doStartTag() throws JspException {
		this.evaluateExpressions();
		return super.doStartTag();
	}
	
	/**
	 * Asigna la vista de accesos del usuario.
	 * @param accessView_ vista de accesos del usuario. 
	 */	
	public void setRules(String rules) {
		this.rules_ = rules;
	}
	/**
	 * Asigna la vista de accesos del usuario.
	 * @param accessView_ vista de accesos del usuario. 
	 */	
	public void setCredential(String credential) {
		this.credential_ = credential;
	}
	
	/**
	 * Evalúa los atributos en busca de expresiones EL.
	 * @throws JspException
	 */
	protected void evaluateExpressions() throws JspException {
		// verifica si el campo validAccesses tiene una expresión EL y la evalúa.
		if(rules_ != null) {
			rules = (String) ExpressionEvaluatorManager.evaluate(RULES, rules_,
																 		java.lang.Object.class,
																 		this, pageContext);
		}
		// verifica si el campo validAccesses tiene una expresión EL y la evalúa.
		if(credential_ != null) {
			userCredential = (Credential) ExpressionEvaluatorManager.evaluate(USER_CREDENTIAL, credential_,
																		Credential.class,
																 		this, pageContext);
		}
	}
}
