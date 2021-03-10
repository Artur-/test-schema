declare module '*.shadow.css' {
  import { CSSResult } from 'lit-element';
  const content: CSSResult;
  export default content;
}

declare module '*.css' {
  import { CSSResult } from 'lit-element';
  /**
   * @deprecated For CSS files that should be imported as a `CssResult`
   *   (for usage in a `static get styles()` method for example),
   *   you should use a file name suffix of `*.shadow.css` to keep your import
   *   forwards compatible.
   *
   *   In a future version we will change the default CSS loader to inject the
   *   CSS as a stylesheet into document scope instead of exporting it as
   *   a `CssResult` and the old behaviour of exporting `CssResult` will be
   *   available via a separate loader that only applies to `*.shadow.css` files.
   *
   *   See https://github.com/vaadin/flow/issues/9970 for more info.
   */
  const content: CSSResult;
  export default content;
}
