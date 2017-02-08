;(function(window) {

  var svgSprite = '<svg>' +
    '' +
    '<symbol id="icon-edit1" viewBox="0 0 1024 1024">' +
    '' +
    '<path d="M800 960l-576 0c-52.928 0-96-43.072-96-96l0-640c0-52.928 43.072-96 96-96l448 0c17.696 0 32 14.336 32 32s-14.304 32-32 32l-448 0c-17.632 0-32 14.368-32 32l0 640c0 17.664 14.368 32 32 32l576 0c17.664 0 32-14.336 32-32l0-512c0-17.664 14.304-32 32-32s32 14.336 32 32l0 512c0 52.928-43.072 96-96 96zM612 448c-8.192 0-16.384-3.136-22.624-9.376-12.512-12.512-12.512-32.736 0-45.248l318.016-318.016c12.512-12.512 32.736-12.512 45.248 0s12.512 32.736 0 45.248l-318.016 318.016c-6.24 6.272-14.432 9.376-22.624 9.376zM480 448l-192 0c-17.664 0-32-14.336-32-32s14.336-32 32-32l192 0c17.664 0 32 14.336 32 32s-14.336 32-32 32zM672 640l-384 0c-17.664 0-32-14.304-32-32s14.336-32 32-32l384 0c17.696 0 32 14.304 32 32s-14.304 32-32 32z"  ></path>' +
    '' +
    '</symbol>' +
    '' +
    '<symbol id="icon-edit" viewBox="0 0 1024 1024">' +
    '' +
    '<path d="M711.1104 960 312.8896 960C175.6544 960 64 848.3456 64 711.1104L64 312.8896C64 175.6544 175.6544 64 312.8896 64l149.3312 0C489.7472 64 512 86.2976 512 113.7792s-22.2528 49.7792-49.7792 49.7792L312.8896 163.5584c-82.3296 0-149.3312 67.0016-149.3312 149.3312l0 398.2208c0 82.3296 67.0016 149.3312 149.3312 149.3312l398.2208 0c82.3296 0 149.3312-67.0016 149.3312-149.3312L860.4416 512c0-27.4752 22.2528-49.7792 49.7792-49.7792 27.5264 0 49.7792 22.2976 49.7792 49.7792l0 199.1104C960 848.3456 848.3456 960 711.1104 960z"  ></path>' +
    '' +
    '<path d="M336.0832 681.8368 336.0832 681.8368c-29.1712-29.1712-29.1712-76.4608 0-105.5808l490.0608-490.0608c29.1712-29.1712 76.4608-29.1712 105.5808 0l0 0c29.1712 29.1712 29.1712 76.4608 0 105.5808l-490.0608 490.0608C412.5376 710.9568 365.2544 710.9568 336.0832 681.8368z"  ></path>' +
    '' +
    '</symbol>' +
    '' +
    '<symbol id="icon-del1" viewBox="0 0 1024 1024">' +
    '' +
    '<path d="M845.328 144l-240 0L605.328 96c0-26.512-21.488-48-48-48l-96 0c-26.512 0-48 21.488-48 48l0 48-240 0c-26.512 0-48 21.504-48 48l0 48 768 0 0-48C893.328 165.504 871.84 144 845.328 144zM173.328 928c0 26.512 21.488 48 48 48l576 0c26.512 0 48-21.488 48-48L845.328 288l-672 0L173.328 928zM653.328 432c0-26.496 21.488-48 48-48s48 21.504 48 48l0 400c0 26.512-21.488 48-48 48s-48-21.488-48-48L653.328 432zM461.328 432c0-26.496 21.504-48 48-48 26.512 0 48 21.504 48 48l0 400c0 26.512-21.488 48-48 48-26.496 0-48-21.488-48-48L461.328 432zM269.328 432c0-26.496 21.488-48 48-48s48 21.504 48 48l0 400c0 26.512-21.488 48-48 48s-48-21.488-48-48L269.328 432z"  ></path>' +
    '' +
    '</symbol>' +
    '' +
    '<symbol id="icon-del" viewBox="0 0 1024 1024">' +
    '' +
    '<path d="M563.2 204.8 563.2 153.6 460.8 153.6l0 51.2L153.6 204.8l0 102.4 51.2 0 0 460.8c0 56.32 46.08 102.4 102.4 102.4l409.6 0c56.32 0 102.4-46.08 102.4-102.4L819.2 307.2l51.2 0L870.4 204.8 563.2 204.8zM716.8 768 307.2 768 307.2 307.2l409.6 0L716.8 768z"  ></path>' +
    '' +
    '<path d="M409.6 409.6 409.6 665.6 460.8 665.6 460.8 409.6Z"  ></path>' +
    '' +
    '<path d="M563.2 409.6 563.2 665.6 614.4 665.6 614.4 409.6Z"  ></path>' +
    '' +
    '</symbol>' +
    '' +
    '</svg>'
  var script = function() {
    var scripts = document.getElementsByTagName('script')
    return scripts[scripts.length - 1]
  }()
  var shouldInjectCss = script.getAttribute("data-injectcss")

  /**
   * document ready
   */
  var ready = function(fn) {
    if (document.addEventListener) {
      if (~["complete", "loaded", "interactive"].indexOf(document.readyState)) {
        setTimeout(fn, 0)
      } else {
        var loadFn = function() {
          document.removeEventListener("DOMContentLoaded", loadFn, false)
          fn()
        }
        document.addEventListener("DOMContentLoaded", loadFn, false)
      }
    } else if (document.attachEvent) {
      IEContentLoaded(window, fn)
    }

    function IEContentLoaded(w, fn) {
      var d = w.document,
        done = false,
        // only fire once
        init = function() {
          if (!done) {
            done = true
            fn()
          }
        }
        // polling for no errors
      var polling = function() {
        try {
          // throws errors until after ondocumentready
          d.documentElement.doScroll('left')
        } catch (e) {
          setTimeout(polling, 50)
          return
        }
        // no errors, fire

        init()
      };

      polling()
        // trying to always fire before onload
      d.onreadystatechange = function() {
        if (d.readyState == 'complete') {
          d.onreadystatechange = null
          init()
        }
      }
    }
  }

  /**
   * Insert el before target
   *
   * @param {Element} el
   * @param {Element} target
   */

  var before = function(el, target) {
    target.parentNode.insertBefore(el, target)
  }

  /**
   * Prepend el to target
   *
   * @param {Element} el
   * @param {Element} target
   */

  var prepend = function(el, target) {
    if (target.firstChild) {
      before(el, target.firstChild)
    } else {
      target.appendChild(el)
    }
  }

  function appendSvg() {
    var div, svg

    div = document.createElement('div')
    div.innerHTML = svgSprite
    svgSprite = null
    svg = div.getElementsByTagName('svg')[0]
    if (svg) {
      svg.setAttribute('aria-hidden', 'true')
      svg.style.position = 'absolute'
      svg.style.width = 0
      svg.style.height = 0
      svg.style.overflow = 'hidden'
      prepend(svg, document.body)
    }
  }

  if (shouldInjectCss && !window.__iconfont__svg__cssinject__) {
    window.__iconfont__svg__cssinject__ = true
    try {
      document.write("<style>.svgfont {display: inline-block;width: 1em;height: 1em;fill: currentColor;vertical-align: -0.1em;font-size:16px;}</style>");
    } catch (e) {
      console && console.log(e)
    }
  }

  ready(appendSvg)


})(window)