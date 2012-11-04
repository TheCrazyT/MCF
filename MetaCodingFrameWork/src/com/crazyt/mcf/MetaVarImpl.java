package com.crazyt.mcf;

public class MetaVarImpl implements MetaVar {
	private String name;
	public MetaVarImpl(String n){
		this.name = n;
	}
	/* (non-Javadoc)
	 * @see com.crazyt.mcf.MetaVar#getName()
	 */
	public String _getName() {
		return name;
	}
	/* (non-Javadoc)
	 * @see com.crazyt.mcf.MetaVar#setName(java.lang.String)
	 */
	public void _setName(String name) {
		this.name = name;
	}
}
