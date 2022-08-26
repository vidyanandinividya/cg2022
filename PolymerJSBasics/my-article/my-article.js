import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@polymer/paper-button/paper-button.js'
/**
 * `my-article`
 * 
 *
 * @customElement
 * @polymer
 * @demo demo/index.html
 */
class MyArticle extends PolymerElement {
  static get template() {
    return html`
      <style>
        :host {
          display: block;
        }
        .article
        {
          display:block;
          width:25%;
          background-color:#fff;
          color:#ff3f3;
          box-shadow:0 4px 8px 0 rgba(0,0,0,0.2),0 6px 20px 0 rgba(0,0,0,0.2);
          text-align:center;
          padding:1%;
          margin:1%;
        }
      </style>
      <div class="article">
      <h2>Hello [[name]]</h2>
      <p>Age: [[age]]</p>
      <paper-button>[[btn]]</paper-button>
      </div>
    `;
  }
  static get properties() {
    return {
      name:{
        type: String,
        value:'world'
      },
      age:{
        type:Number,
        value:0
      },
      btn:{
        type:String,
        value:'More'
      }
    };
  }
}

window.customElements.define('my-article', MyArticle);
