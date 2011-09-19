
YAHOO.util.Event.onDOMReady(initYUIPanels);


function initYUIPanels(){
	YAHOO.namespace("ep.common.chat");
	
	YAHOO.ep.common.chat.manager = new YAHOO.widget.OverlayManager();
	/** init yui panels **/
	YAHOO.ep.common.chat.chatWindow = new YAHOO.widget.Panel("main", 
		{xy:[100,100],visible:false,width:"500px",/*height:"190px",*/ zIndex:1006, 
			effect:{effect:YAHOO.widget.ContainerEffect.FADE, duration: 0.3}, constraintoviewport:true});
	YAHOO.ep.common.chat.chatWindow.render();
	//YAHOO.ep.common.chat.chatWindow.hide();
	YAHOO.ep.common.chat.manager.register([YAHOO.ep.common.chat.chatWindow]);
}

