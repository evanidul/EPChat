
YAHOO.util.Event.onDOMReady(initYUIPanels);


function initYUIPanels(){
	YAHOO.namespace("ep.common.chat");
	
	YAHOO.ep.common.chat.manager = new YAHOO.widget.OverlayManager();
	/** init yui panels **/
	YAHOO.ep.common.chat.chatWindow = new YAHOO.widget.Panel("main", 
		{xy:[200,200],visible:false,width:"225px",height:"350px", zIndex:1006, 
			effect:{effect:YAHOO.widget.ContainerEffect.FADE, duration: 0.3}, constraintoviewport:false});
	YAHOO.ep.common.chat.chatWindow.render();
	YAHOO.ep.common.chat.chatWindow.show();
	YAHOO.ep.common.chat.manager.register([YAHOO.ep.common.chat.chatWindow]);
}


