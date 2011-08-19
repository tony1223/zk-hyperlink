zul.fiddle.hyperlink.Hyperlink = zk.$extends(zul.wgt.A, {
	_disableHref:false,
	doClick_: function(evt){
		if (this._disabled) 
			evt.stop(); //prevent browser default
		else {
			
			if (this.isListen('onClick') || this._disableHref) {
				this.fire("onClick");
				evt.stop();
			} else {
				this.fireX(evt);
				if (!evt.stopped) this.$super('doClick_', evt, true);
			}
		}
		//Unlike DOM, we don't proprogate to parent (so not call $supers)
	}
});
